package rojas.gabriel.projetojogos.model;

import lombok.*;

/**
 @author Gabriel Rojas
 @since 01/05/2020
 @version Projeto 1.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Games {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String genre;
    @Getter @Setter
    private String plataform;
    @Getter @Setter
    private String releaseDate;

}
