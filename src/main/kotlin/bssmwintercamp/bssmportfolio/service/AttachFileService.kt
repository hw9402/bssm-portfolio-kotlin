package bssmwintercamp.bssmportfolio.service

import bssmwintercamp.bssmportfolio.repository.AttachFileRepository
import bssmwintercamp.bssmportfolio.service.dto.CreateAttachFileDto
import bssmwintercamp.bssmportfolio.service.dto.toEntity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class AttachFileService(
    private val attachFileRepository: AttachFileRepository,
) {

    fun create(dto: CreateAttachFileDto): String {
        // S3 업로드 + UID 생성
        val attachFile = attachFileRepository.save(dto.toEntity())
        return attachFile.fileUid
    }
}
