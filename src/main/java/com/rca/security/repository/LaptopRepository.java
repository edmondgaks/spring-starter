package com.rca.security.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rca.security.entity.Laptop;
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}
