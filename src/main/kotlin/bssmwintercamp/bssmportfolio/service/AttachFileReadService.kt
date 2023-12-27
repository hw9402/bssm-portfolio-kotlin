package bssmwintercamp.bssmportfolio.service

import bssmwintercamp.bssmportfolio.domain.entity.AttachFile
import bssmwintercamp.bssmportfolio.repository.AttachFileRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class AttachFileReadService(
    private val attachFileRepository: AttachFileRepository,
) {

    fun findByFileUidOrThrow(fileUid: String): AttachFile? {
        return attachFileRepository.findByFileUid(fileUid)
    }
}
