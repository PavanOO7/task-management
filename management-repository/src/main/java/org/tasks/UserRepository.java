package org.tasks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tasks.dao.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
