
package com.bike.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bike.demo.model.BikeDemo;

@Repository


	public interface BikeDemoRepository extends JpaRepository<BikeDemo,Integer>{
	
	//List<BikeDemo> findByUsernameStartingWith(String prefix);

	//List<BikeDemo> findByUsernameEndingWith(String suffix);

	//List<BikeDemo> findByUsername(String attri);
}
