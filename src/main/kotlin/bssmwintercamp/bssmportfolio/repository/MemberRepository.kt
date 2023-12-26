package bssmwintercamp.bssmportfolio.repository

import bssmwintercamp.bssmportfolio.domain.entity.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository: JpaRepository<Member, Long> {
}
