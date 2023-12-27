package bssmwintercamp.bssmportfolio.service.dto

import bssmwintercamp.bssmportfolio.domain.entity.AttachFile

data class CreateAttachFileDto(
    val fileUid: String,
    val filePath: String,
    val fileName: String,
    val fileSize: Long,
)

fun CreateAttachFileDto.toEntity() = AttachFile(
    fileUid = fileUid,
    filePath = filePath,
    fileName = fileName,
    fileSize = fileSize,
)
