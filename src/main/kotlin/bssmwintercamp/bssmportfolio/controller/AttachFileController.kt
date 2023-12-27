package bssmwintercamp.bssmportfolio.controller

import bssmwintercamp.bssmportfolio.controller.rq.UploadAttachFileRq
import bssmwintercamp.bssmportfolio.controller.rq.toDto
import bssmwintercamp.bssmportfolio.global.ApiPath
import bssmwintercamp.bssmportfolio.service.AttachFileService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AttachFileController(
    private val attachFileService: AttachFileService,
) {

    @PostMapping(ApiPath.FILE_V1)
    fun uploadFile(@RequestBody rq: UploadAttachFileRq): String {
        return attachFileService.create(rq.toDto())
    }
}
