package bssmwintercamp.bssmportfolio.controller

import bssmwintercamp.bssmportfolio.controller.rq.MemberRq
import bssmwintercamp.bssmportfolio.controller.rq.toDto
import bssmwintercamp.bssmportfolio.global.ApiPath
import bssmwintercamp.bssmportfolio.service.MemberService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(
    private val memberService: MemberService,
) {

    @PostMapping(ApiPath.MEMBER_V1)
    fun createMember(@RequestBody memberRq: MemberRq): Long {
        return memberService.create(memberRq.toDto())
    }
}
