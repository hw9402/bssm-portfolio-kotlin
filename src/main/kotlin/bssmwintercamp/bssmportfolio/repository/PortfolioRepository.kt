package bssmwintercamp.bssmportfolio.repository

import bssmwintercamp.bssmportfolio.domain.entity.Portfolio
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PortfolioRepository: JpaRepository<Portfolio, Long> {
}
