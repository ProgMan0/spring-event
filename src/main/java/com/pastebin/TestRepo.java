package com.pastebin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Testing, Long> {
}
