package bssmwintercamp.bssmportfolio.service

import bssmwintercamp.bssmportfolio.domain.enums.PortfolioProtectType
import bssmwintercamp.bssmportfolio.domain.enums.PortfolioThemeType
import bssmwintercamp.bssmportfolio.service.dto.CreateAttachFileDto
import bssmwintercamp.bssmportfolio.service.dto.CreateMemberDto
import bssmwintercamp.bssmportfolio.service.dto.CreatePortfolioDto
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.comparables.shouldBeGreaterThan
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PortfolioServiceTest(
    private val memberService: MemberService,
    private val portfolioService: PortfolioService,
    private val attachFileService: AttachFileService,
) : BehaviorSpec({

    beforeSpec {
        val dto = CreateMemberDto("mhw35689402@gmail.com", "1234", "마현우")
        memberService.create(dto)

        val videoFileDto = CreateAttachFileDto("fileUid01", "filePath", "fileName", 100L)
        val thumbnailFileDto = CreateAttachFileDto("fileUid02", "filePath", "fileName", 100L)
        attachFileService.create(videoFileDto)
        attachFileService.create(thumbnailFileDto)
    }

    given("포트폴리오 데이터 생성") {
        val dto = CreatePortfolioDto(
            "제목", PortfolioThemeType.APP, PortfolioProtectType.PUBLIC, "설명", "웹 주소",
            "깃 주소", 1, "fileUid01", "fileUid02"
        )
        `when`("포트폴리오 데이터를 저장하면") {
            val portfolioId = portfolioService.create(dto)
            then("포트폴리오 데이터가 정상적으로 저장되고 ID를 반환한다.") {
                portfolioId shouldBeGreaterThan 0
            }
        }
    }
})
