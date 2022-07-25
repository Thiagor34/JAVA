package Interface;

import java.time.LocalDateTime;

public interface TimeCliente {

    void setTime(int hora, int min, int seg);

    void setDate(int dia, int mes, int ano);

    void setDateTime(int dia, int mes, int ano, int hora, int min, int seg);

    LocalDateTime getLocalDateTime();

}
