
import java.util.HashMap;
import java.util.Map;

/**
 * En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones,
 * una torre 5 peones, un alfil 3, un caballo 2 y un péon vale, lógicamente,
 * 1 peón. Realiza un programa que genere al azar las capturas que ha hecho
 * un jugador durante una partida. El número de capturas será un valor aleatorio
 * entre 0 y 15. Hay que tener en cuenta que cada jugador tiene la posibilidad
 * de
 * capturar algunas de las siguientes piezas (no más): 1 dama, 2 torres, 2
 * alfiles,
 * 2 caballos y 8 peones. Al final debe aparecer la puntuación total.
 * 
 * @author ECD
 * @input nada
 * @output
 */
public class Eje_6_23 {
    public static void main(String[] args) {
        HashMap<String, Integer> valores = new HashMap<>();
        HashMap<Integer, String> piezasTomadas = new HashMap<>();
        HashMap<String, Integer> maximos = new HashMap<>();
        int random = (int) (Math.random() * 15) + 1;
        int puntos = random;
        int cont = 0;

        maximos.put("torre", 2);
        maximos.put("alfil", 2);
        maximos.put("caballo", 2);
        maximos.put("peon", 8);
        valores.put("dama", 9);
        valores.put("torre", 5);
        valores.put("alfil", 3);
        valores.put("caballo", 2);
        valores.put("peon", 1);
        do {

            if (random >= 9) {
                int randomVal = (int) (Math.random() * 5) + 1;
                switch (randomVal) {
                    case 1:
                        piezasTomadas.put(cont++, "dama");
                        random -= 9;
                        break;
                    case 2:
                        if (maximos.get("torre") != 0) {
                            piezasTomadas.put(cont++, "torre");
                            random -= 5;
                            maximos.put("torre", maximos.get("torre") - 1);
                        }
                        break;
                    case 3:
                        if (maximos.get("alfil") != 0) {
                            piezasTomadas.put(cont++, "alfil");
                            random -= 3;
                            maximos.put("alfil", maximos.get("alfil") - 1);
                        }

                        break;
                    case 4:
                        if (maximos.get("caballo") != 0) {
                            piezasTomadas.put(cont++, "caballo");
                            random -= 2;
                            maximos.put("caballo", maximos.get("caballo") - 1);
                        }

                        break;
                    case 5:
                        if (maximos.get("peon") != 0) {
                            piezasTomadas.put(cont++, "peon");
                            random -= 1;
                            maximos.put("peon", maximos.get("peon") - 1);
                        }

                        break;

                    default:
                        break;
                }

            } else if (random >= 5) {
                int randomVal = (int) (Math.random() * 4) + 1;
                switch (randomVal) {
                    case 1:
                        if (maximos.get("torre") != 0) {
                            piezasTomadas.put(cont++, "torre");
                            random -= 5;
                            maximos.put("torre", maximos.get("torre") - 1);
                        }
                        break;
                    case 2:
                        if (maximos.get("alfil") != 0) {
                            piezasTomadas.put(cont++, "alfil");
                            random -= 3;
                            maximos.put("alfil", maximos.get("alfil") - 1);
                        }

                        break;
                    case 3:
                        if (maximos.get("caballo") != 0) {
                            piezasTomadas.put(cont++, "caballo");
                            random -= 2;
                            maximos.put("caballo", maximos.get("caballo") - 1);
                        }

                        break;
                    case 4:
                        if (maximos.get("peon") != 0) {
                            piezasTomadas.put(cont++, "peon");
                            random -= 1;
                            maximos.put("peon", maximos.get("peon") - 1);
                        }

                        break;

                    default:
                        break;
                }

            } else if (random >= 3) {
                int randomVal = (int) (Math.random() * 3) + 1;
                switch (randomVal) {
                    case 1:
                        if (maximos.get("alfil") != 0) {
                            piezasTomadas.put(cont++, "alfil");
                            random -= 3;
                            maximos.put("alfil", maximos.get("alfil") - 1);
                        }

                        break;
                    case 2:
                        if (maximos.get("caballo") != 0) {
                            piezasTomadas.put(cont++, "caballo");
                            random -= 2;
                            maximos.put("caballo", maximos.get("caballo") - 1);
                        }
                        break;
                    case 3:
                        if (maximos.get("peon") != 0) {
                            piezasTomadas.put(cont++, "peon");
                            random -= 1;
                            maximos.put("peon", maximos.get("peon") - 1);
                        }

                        break;

                    default:
                        break;
                }
            } else if (random >= 2) {
                int randomVal = (int) (Math.random() * 2) + 1;
                switch (randomVal) {
                    case 1:
                        if (maximos.get("caballo") != 0) {
                            piezasTomadas.put(cont++, "caballo");
                            random -= 2;
                            maximos.put("caballo", maximos.get("caballo") - 1);
                        }

                        break;
                    case 2:
                        if (maximos.get("peon") != 0) {
                            piezasTomadas.put(cont++, "peon");
                            random -= 1;
                            maximos.put("peon", maximos.get("peon") - 1);
                        }

                        break;

                    default:
                        break;
                }
            } else {
                if (maximos.get("peon") != 0) {
                    piezasTomadas.put(cont++, "peon");
                    random -= 1;
                    maximos.put("peon", maximos.get("peon") - 1);
                }

            }
        } while (random > 0);

        System.out.println("fichas capturasas por el jugador: ");
        for (

        Map.Entry pieza : piezasTomadas.entrySet()) {
            System.out.printf("%s (%s peones)\n", pieza.getValue(), valores.get(pieza.getValue()));

        }
        System.out.println("Puntos totales: " + puntos);
    }

}
