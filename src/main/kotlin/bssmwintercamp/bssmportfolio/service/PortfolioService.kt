package bssmwintercamp.bssmportfolio.service

import bssmwintercamp.bssmportfolio.repository.PortfolioRepository
import bssmwintercamp.bssmportfolio.service.dto.CreatePortfolioDto
import bssmwintercamp.bssmportfolio.service.dto.toEntity
import org.springframework.stereotype.Service

@Service
class PortfolioService(
    private val portfolioRepository: PortfolioRepository,
    private val memberReadService: MemberReadService,
    private val attachFileReadService: AttachFileReadService,
) {

    fun create(dto: CreatePortfolioDto): Long {
        return portfolioRepository.save(dto.toEntity(
            memberReadService.findById(dto.member),
            attachFileReadService.findByFileUidOrThrow(dto.videoFile),
            attachFileReadService.findByFileUidOrThrow(dto.thumbnailFile),
        )).id
    }
}
