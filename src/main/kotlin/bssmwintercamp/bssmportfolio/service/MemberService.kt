package bssmwintercamp.bssmportfolio.service

import bssmwintercamp.bssmportfolio.repository.MemberRepository
import bssmwintercamp.bssmportfolio.service.dto.CreateMemberDto
import bssmwintercamp.bssmportfolio.service.dto.toEntity
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    fun create(dto: CreateMemberDto): Long {
        val member = dto.toEntity()
        memberRepository.save(member)
        return member.id
    }
}
