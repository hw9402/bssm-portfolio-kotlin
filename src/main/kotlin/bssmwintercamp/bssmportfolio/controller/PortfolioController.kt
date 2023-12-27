package bssmwintercamp.bssmportfolio.controller

import bssmwintercamp.bssmportfolio.controller.rq.CreatePortfolioRq
import bssmwintercamp.bssmportfolio.controller.rq.toDto
import bssmwintercamp.bssmportfolio.global.ApiPath
import bssmwintercamp.bssmportfolio.service.PortfolioService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PortfolioController(
    private val portfolioService: PortfolioService
) {

    @PostMapping(ApiPath.PORTFOLIO_v1)
    fun createPortfolio(@RequestBody rq: CreatePortfolioRq): Long {
        return portfolioService.create(rq.toDto())
    }
}
