package bssmwintercamp.bssmportfolio.service

import bssmwintercamp.bssmportfolio.domain.entity.Member
import bssmwintercamp.bssmportfolio.repository.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class MemberReadService(
    private val memberRepository: MemberRepository
) {

    fun findById(id: Long): Member {
        return memberRepository.findById(id).orElseThrow()
    }
}
