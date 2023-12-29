package inu.amigo.orderIt.repository;

import inu.amigo.orderIt.domain.item.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    Image findByImageId(Long imageId);
    Image findByUuid(UUID uuid);
}