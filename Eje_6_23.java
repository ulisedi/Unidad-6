
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
        HashMap<Integer, String> valores = new HashMap<>();
        HashMap<String, Integer> piezasTomadas = new HashMap<>();
        int random = (int) (Math.random() * 15) + 1;
        int puntos = random;
        valores.put(9, "dama");
        valores.put(5, "torre");
        valores.put(3, "alfil");
        valores.put(2, "caballo");
        valores.put(1, "peon");
        do {

            if (random >= 9) {
                int randomVal = (int) (Math.random() * 5) + 1;
                switch (randomVal) {
                    case 1:
                        piezasTomadas.put("dama", 1);
                        random -= 9;
                        break;
                    case 2:
                        if (!piezasTomadas.containsKey("torre")) {
                            piezasTomadas.put("torre", 1);
                            random -= 5;
                        } else if (piezasTomadas.get("torre") < 2) {
                            piezasTomadas.put("torre", piezasTomadas.get("torre") + 1);
                        }
                        break;
                    case 3:
                        if (!piezasTomadas.containsKey("alfil")) {
                            piezasTomadas.put("alfil", 1);
                            random -= 3;
                        } else if (piezasTomadas.get("alfil") < 2) {
                            piezasTomadas.put("alfil", piezasTomadas.get("alfil") + 1);
                        }

                        random -= 3;
                        break;
                    case 4:
                        if (!piezasTomadas.containsKey("caballo")) {
                            piezasTomadas.put("caballo", 1);
                            random -= 2;
                        } else if (piezasTomadas.get("caballo") < 2) {
                            piezasTomadas.put("caballo", piezasTomadas.get("caballo") + 1);
                        }

                        random -= 2;
                        break;
                    case 5:
                        if (!piezasTomadas.containsKey("peon")) {
                            piezasTomadas.put("peon", 1);
                            random -= 2;
                        } else if (piezasTomadas.get("peon") < 8) {
                            piezasTomadas.put("peon", piezasTomadas.get("peon") + 1);
                        }
                        random -= 1;
                        break;

                    default:
                        break;
                }

            } else if (random >= 5) {
                int randomVal = (int) (Math.random() * 4) + 1;
                switch (randomVal) {
                    case 1:
                        if (!piezasTomadas.containsKey("torre")) {
                            piezasTomadas.put("torre", 1);
                            random -= 5;
                        } else if (piezasTomadas.get("torre") < 2) {
                            piezasTomadas.put("torre", piezasTomadas.get("torre") + 1);
                        }
                        break;
                    case 2:
                        if (!piezasTomadas.containsKey("alfil")) {
                            piezasTomadas.put("alfil", 1);
                            random -= 3;
                        } else if (piezasTomadas.get("alfil") < 2) {
                            piezasTomadas.put("alfil", piezasTomadas.get("alfil") + 1);
                        }

                        random -= 3;
                        break;
                    case 3:
                        if (!piezasTomadas.containsKey("caballo")) {
                            piezasTomadas.put("caballo", 1);
                            random -= 2;
                        } else if (piezasTomadas.get("caballo") < 2) {
                            piezasTomadas.put("caballo", piezasTomadas.get("caballo") + 1);
                        }

                        random -= 2;
                        break;
                    case 4:
                        if (!piezasTomadas.containsKey("peon")) {
                            piezasTomadas.put("peon", 1);
                            random -= 2;
                        } else if (piezasTomadas.get("peon") < 8) {
                            piezasTomadas.put("peon", piezasTomadas.get("peon") + 1);
                        }
                        random -= 1;
                        break;

                    default:
                        break;
                }

            } else if (random >= 3) {
                int randomVal = (int) (Math.random() * 3) + 1;
                switch (randomVal) {
                    case 1:
                        if (!piezasTomadas.containsKey("alfil")) {
                            piezasTomadas.put("alfil", 1);
                            random -= 3;
                        } else if (piezasTomadas.get("alfil") < 2) {
                            piezasTomadas.put("alfil", piezasTomadas.get("alfil") + 1);
                        }

                        random -= 3;
                        break;
                    case 2:
                        if (!piezasTomadas.containsKey("caballo")) {
                            piezasTomadas.put("caballo", 1);
                            random -= 2;
                        } else if (piezasTomadas.get("caballo") < 2) {
                            piezasTomadas.put("caballo", piezasTomadas.get("caballo") + 1);
                        }

                        random -= 2;
                        break;
                    case 3:
                        if (!piezasTomadas.containsKey("peon")) {
                            piezasTomadas.put("peon", 1);
                            random -= 2;
                        } else if (piezasTomadas.get("peon") < 8) {
                            piezasTomadas.put("peon", piezasTomadas.get("peon") + 1);
                        }
                        random -= 1;
                        break;

                    default:
                        break;
                }
            } else if (random >= 2) {
                int randomVal = (int) (Math.random() * 2) + 1;
                switch (randomVal) {
                    case 1:
                        if (!piezasTomadas.containsKey("caballo")) {
                            piezasTomadas.put("caballo", 1);
                            random -= 2;
                        } else if (piezasTomadas.get("caballo") < 2) {
                            piezasTomadas.put("caballo", piezasTomadas.get("caballo") + 1);
                        }

                        random -= 2;
                        break;
                    case 2:
                        if (!piezasTomadas.containsKey("peon")) {
                            piezasTomadas.put("peon", 1);
                            random -= 2;
                        } else if (piezasTomadas.get("peon") < 8) {
                            piezasTomadas.put("peon", piezasTomadas.get("peon") + 1);
                        }
                        random -= 1;
                        break;

                    default:
                        break;
                }
            } else {
                if (!piezasTomadas.containsKey("peon")) {
                    piezasTomadas.put("peon", 1);
                    random -= 2;
                } else if (piezasTomadas.get("peon") < 8) {
                    piezasTomadas.put("peon", piezasTomadas.get("peon") + 1);
                }
                random -= 1;
            }
        } while (random <= 0);

        System.out.println("fichas capturasas por el jugador: ");
        for (Map.Entry pieza : piezasTomadas.entrySet()) {
            System.out.printf("%s (%d peones)\n", pieza.getKey(), (pieza.getValue())* valores. );
        }
        System.out.println("Puntos totales: "+puntos +" peones");
    }

}
