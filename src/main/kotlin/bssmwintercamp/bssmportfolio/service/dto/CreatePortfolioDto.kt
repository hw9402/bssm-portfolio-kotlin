package bssmwintercamp.bssmportfolio.service.dto

import bssmwintercamp.bssmportfolio.domain.entity.AttachFile
import bssmwintercamp.bssmportfolio.domain.entity.Member
import bssmwintercamp.bssmportfolio.domain.entity.Portfolio
import bssmwintercamp.bssmportfolio.domain.enums.PortfolioProtectType
import bssmwintercamp.bssmportfolio.domain.enums.PortfolioThemeType

data class CreatePortfolioDto(
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

fun CreatePortfolioDto.toEntity(
    member: Member,
    videoFile: AttachFile,
    thumbnailFile: AttachFile
) = Portfolio(
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
