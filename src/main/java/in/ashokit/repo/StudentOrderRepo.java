package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.dto.StudentOrder;

@Repository
public interface StudentOrderRepo extends JpaRepository<StudentOrder, Integer>{

	public StudentOrder findByRazorPayOrderId(String razorPayOrderId);

}
