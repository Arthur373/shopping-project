package am.gitc.shopping.repository;

import am.gitc.shopping.entity.DealEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealRepository extends JpaRepository<DealEntity,Integer> {
}
