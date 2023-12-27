package bssmwintercamp.bssmportfolio.controller.rq

import bssmwintercamp.bssmportfolio.service.dto.CreateAttachFileDto

data class UploadAttachFileRq(
    val fileUid: String,
    val filePath: String,
    val fileName: String,
    val fileSize: Long,
)

fun UploadAttachFileRq.toDto() = CreateAttachFileDto(
    fileUid = fileUid,
    filePath = filePath,
    fileName = fileName,
    fileSize = fileSize
)
