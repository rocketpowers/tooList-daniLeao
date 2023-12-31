package todoListPackages.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name= "tb_users")
@Getter
@Setter
public class UserModel {

	@Id
	@GeneratedValue(generator="UUID")
	private UUID id;
	
	private String userName;
	private String name;
	private String password;
	
	@CreationTimestamp
	private LocalDateTime createdAt;

}
