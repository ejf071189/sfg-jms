package guru.springframework.sfgjms.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable{

    static final long serialVersionUID = -6783821943819323328L;

    private UUID id;
    private String message;
}
