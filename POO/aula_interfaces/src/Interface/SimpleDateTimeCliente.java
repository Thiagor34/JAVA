
package Interface;

import java.time.LocalDateTime;

public class SimpleDateTimeCliente implements TimeCliente {
    private LocalDateTime dateAndTime;

    @Override
    public void setTime(int hora, int min, int seg) {
    }

    @Override
    public void setDate(int dia, int mes, int ano) {
    }

    @Override
    public void setDateTime(int dia, int mes, int ano, int hora, int min, int seg) {
    }

    @Override
    public LocalDateTime getLocalDateTime() {
    return dateAndTime;
    }
    
    
    
}
