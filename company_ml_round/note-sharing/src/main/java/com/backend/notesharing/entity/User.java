package com.backend.notesharing.entity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class) // Enables JPA auditing
public class User {
    @NonNull
    private Integer id;
    @NonNull
    private String firstname;
    private String lastname;
    @NonNull
    private String email;
    @NonNull
    private String password;

    @CreatedDate // Sets the field value to the current date and time on creation
    @Column(name = "created_at", nullable = false, updatable = false)
    private Long createdAt;

    @LastModifiedDate // Updates the field value to the current date and time on each update
    @Column(name = "updated_at")
    private Long updatedAt;

    @Column(name = "deleted_at")
    private Long deletedAt;
}
