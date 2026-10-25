//package com.github.Evgenn91.englishlearning.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.EntityListeners;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import java.time.Instant;
//
//@EntityListeners(AuditingEntityListener.class)
////@Getter
////@Setter
//public class AuditIdEntity extends IdEntity {
//    @CreatedDate
//    @Column(name = "created_at", nullable = false, updatable = false)
//    private Instant createdAt;
//
//    @LastModifiedDate
//    @Column(name = "updated_at")
//    private Instant updatedAt;
//
////    @CreatedBy
//    @Column(name = "created_by", updatable = false)
//    private String createdBy;
//
////    @LastModifiedBy
//    @Column(name = "modified_by")
//    private String modifiedBy;
//}
