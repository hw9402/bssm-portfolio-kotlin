package bssmwintercamp.bssmportfolio.controller.rq

import bssmwintercamp.bssmportfolio.domain.enums.PortfolioProtectType
import bssmwintercamp.bssmportfolio.domain.enums.PortfolioThemeType
import bssmwintercamp.bssmportfolio.service.dto.CreatePortfolioDto

data class CreatePortfolioRq(
    val title: String,
    val theme: PortfolioThemeType,
    val protectedType: PortfolioProtectType,
    val description: String,
    val webUrl: String,
    val gitUrl: String,
    val member: Long,
    val videoFile: String,
    val thumbnailFile: String,
)

fun CreatePortfolioRq.toDto() = CreatePortfolioDto(
    title = title,
    theme = theme,
    protectedType = protectedType,
    description = description,
    webUrl = webUrl,
    gitUrl = gitUrl,
    member = member,
    videoFile = videoFile,
    thumbnailFile = thumbnailFile
)
