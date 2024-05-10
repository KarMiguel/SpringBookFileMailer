package io.github.karMiguel.library.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdatePasswordVO {


    @NotBlank
    @Email( regexp = "^[a-z0-9.+-]+@[a-z0-9.-]+\\.[a-z]{2,}$",message = "formato email inválido.")
    private String username;

    @NotBlank
    @Size(min = 6,max = 6)
    private String newPassword;

    @NotBlank
    @Size(min = 6,max = 6)
    private String confPassword;

    @NotBlank(message = "Código não pode ser nulo.")
    private String code;
}
