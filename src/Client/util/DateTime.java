/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;
import Client.frame.Pool;

/**
 *
 * @author Pablo Alejos
 */
public final class DateTime {

    private final Pool pool;

    public DateTime(Pool pool) {
        this.pool = pool;
        dateInit();
        timeRun();
    }

    public void dateInit() {
        Date sisDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd MM YYYY");
        pool.date.setText(format.format(sisDate));
        pool.txtFechaSalida.setText(format.format(sisDate));
    }

    public void timeRun(){
        Timer timer = new Timer(100, new DateTime.timeTimer());
        timer.start();
    }
    
    class timeTimer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date sistHora = new Date();
            String pmAm = "hh:mm:ss a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy = Calendar.getInstance();
            pool.time.setText(String.format(format.format(sistHora), hoy));
            pool.txtHoraSalida.setText(String.format(format.format(sistHora), hoy));
        }

    }
}
