	

    public class Bus
    {
        private String origen;
        private String destino;
        private int kilometraje;
        private int valorPasajeN;
        private int valorPasajeVip;
        boolean esVip;
        int asientos=28;
        int pasajeros=0;
        int pasajerosN=0;
        int pasajerosVip=0;
        int ventas;
        Pasajero[] ArrAsientos=new Pasajero[28];
       
        public Bus(String origen, String destino, int kilometraje, int valorPasajeN, int valorPasajeVip)
        {
            this.origen=origen;
            this.destino=destino;
            this.kilometraje=kilometraje;
            this.valorPasajeN=valorPasajeN;
            this.valorPasajeVip=valorPasajeVip;
        }
       
        //Metodos
        public boolean venderPasajeNormal(int asiento, Pasajero p)
        {
            if (asiento>=0 && asiento<28)
                        {
                            if (ArrAsientos[asiento]==null)
                            {
                                    pasajerosN++;
                                    contarPasajeros();
                                    totalVentas();
                                    ArrAsientos[asiento]=p;
                                    asientos--;
                                    return true;
                            }
                            else
                            {
                                 int asientos;
                                 return false;
                            }
                            }
                            else
                            {
                                return false;
                            }
        }
        public boolean venderPasajeVip(int asiento, Pasajero p)
        {
            if (asiento>=0 && asiento<28)
                        {
                            if (ArrAsientos[asiento]==null)
                            {
                                    pasajerosVip++;
                                    contarPasajeros();
                                    totalVentas();
                                    ArrAsientos[asiento]=p;
                                    asientos--;
                                    return true;
                            }
                            else
                            {
                                 int asientos;
                                 return false;
                            }
                            }
                            else
                            {
                                return false;
                            }
        }

    private void totalVentas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void contarPasajeros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

