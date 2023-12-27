package bssmwintercamp.bssmportfolio.repository

import bssmwintercamp.bssmportfolio.domain.entity.AttachFile
import org.springframework.data.jpa.repository.JpaRepository

interface AttachFileRepository: JpaRepository<AttachFile, Long> {
    fun findByFileUid(fileUid: String): AttachFile?
}
