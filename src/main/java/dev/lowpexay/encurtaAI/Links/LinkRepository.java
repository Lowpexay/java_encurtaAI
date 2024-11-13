package dev.lowpexay.encurtaAI.Links;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
    Optional<Link> findByUrlShort(String urlShort);

	Link findByOriginalUrl(String urlShort);

}