package sistemabatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class SistemaBatch {
    private static Connection connSistema;
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://65.19.141.67:3306/ultrasi_bancoultrasi";
    private static final String DB_USER = "ultrasi_user";
    private static final String DB_PASSWORD = "senha123";
    
    private static final String mensagem = "Falha na Conexão. Verifique as Strings de abertura do BD.\n ERRO ORIGINAL:";
    
    /* Banco de Dados Local
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/tabelas";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    */
   
   
    public static void main(String[] argv) throws Exception {
        
        try {
            /*- Na sua aplicação, insira ‘N’ registros na tabela 
            tb_customer_account*/
            inserindoRegistros1();
            inserindoRegistros2();
            funcaoCalculoMedia();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
 
        }
 
    }
    
    private static void inserindoRegistros1() throws Exception{
        try{
            abreConexao();
            
            String sqlBusca = "insert into tb_customer_account (id_customer, "
                            + "cpf_cnpj, nm_customer, is_active, vl_total) values "
                            + "(?,?,?,?,?)";

            PreparedStatement preparedStatement = null;
            preparedStatement = connSistema.prepareStatement(sqlBusca);

            connSistema.setAutoCommit(false);

            preparedStatement.setInt(1, 2600);
            preparedStatement.setString(2, "56330546596");
            preparedStatement.setString(3, "June French");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 486.51);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2601);
            preparedStatement.setString(2, "31055717752");
            preparedStatement.setString(3, "Cael Short");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 858.30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2602);
            preparedStatement.setString(2, "77996953318");
            preparedStatement.setString(3, "Julius Richard");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 280.85);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2603);
            preparedStatement.setString(2, "39362308841");
            preparedStatement.setString(3, "Kasey Escobar");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 585.30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2604);
            preparedStatement.setString(2, "47341934513");
            preparedStatement.setString(3, "Connor Clayton");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 785.97);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2605);
            preparedStatement.setString(2, "26283941109");
            preparedStatement.setString(3, "Paige Crosby");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 962.13);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2606);
            preparedStatement.setString(2, "95983177402");
            preparedStatement.setString(3, "Rafael Silva");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 359.53);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2607);
            preparedStatement.setString(2, "34065364163");
            preparedStatement.setString(3, "Leslie Mcclain");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 666.07);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2608);
            preparedStatement.setString(2, "42927033462");
            preparedStatement.setString(3, "Zackary Barker");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 859.97);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2609);
            preparedStatement.setString(2, "68513627976");
            preparedStatement.setString(3, "Luciana Herring");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 338.50);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2610);
            preparedStatement.setString(2, "56851912117");
            preparedStatement.setString(3, "Nigel Green");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 463.72);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2611);
            preparedStatement.setString(2, "50249040473");
            preparedStatement.setString(3, "Noelle Skinner");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 813.59);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2612);
            preparedStatement.setString(2, "85694746558");
            preparedStatement.setString(3, "Karma Lang");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 774.00);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2613);
            preparedStatement.setString(2, "66150426961");
            preparedStatement.setString(3, "Gaige Foster");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 628.52);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2614);
            preparedStatement.setString(2, "75175030688");
            preparedStatement.setString(3, "Gerardo Odonnell");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 786.93);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2615);
            preparedStatement.setString(2, "39759866211");
            preparedStatement.setString(3, "Darrell Wyatt");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 832.09);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2616);
            preparedStatement.setString(2, "10120168240");
            preparedStatement.setString(3, "Callie Bates");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 531.60);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2617);
            preparedStatement.setString(2, "66578643737");
            preparedStatement.setString(3, "Paityn Cunningham");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 924.09);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2618);
            preparedStatement.setString(2, "61188202618");
            preparedStatement.setString(3, "Moshe Hawkins");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 738.38);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2619);
            preparedStatement.setString(2, "74563186431");
            preparedStatement.setString(3, "Darion Huber");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 682.84);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2620);
            preparedStatement.setString(2, "99382436917");
            preparedStatement.setString(3, "Marcel Cowan");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 545.10);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2621);
            preparedStatement.setString(2, "43251425130");
            preparedStatement.setString(3, "Ariel Contreras");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 282.01);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2622);
            preparedStatement.setString(2, "66809270155");
            preparedStatement.setString(3, "Franco Perry");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 341.96);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2623);
            preparedStatement.setString(2, "37937947785");
            preparedStatement.setString(3, "Eva Nichols");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 658.27);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2624);
            preparedStatement.setString(2, "22538883686");
            preparedStatement.setString(3, "Clarence Carpenter");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 598.68);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2625);
            preparedStatement.setString(2, "73442668181");
            preparedStatement.setString(3, "Chanel Callahan");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 865.57);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2626);
            preparedStatement.setString(2, "73764754623");
            preparedStatement.setString(3, "Priscilla Bauer");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 745.71);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2627);
            preparedStatement.setString(2, "62983601647");
            preparedStatement.setString(3, "Cash Raymond");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 385.35);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2628);
            preparedStatement.setString(2, "62881680201");
            preparedStatement.setString(3, "Brennan Hamilton");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 708.54);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2629);
            preparedStatement.setString(2, "42681202884");
            preparedStatement.setString(3, "Jazmine Jacobs");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 476.66);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2630);
            preparedStatement.setString(2, "38244960805");
            preparedStatement.setString(3, "Libby Liu");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 110.30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2631);
            preparedStatement.setString(2, "19814113459");
            preparedStatement.setString(3, "Nevaeh Barrett");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 537.33);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2632);
            preparedStatement.setString(2, "77167029723");
            preparedStatement.setString(3, "Rhys Charles");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 834.09);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2633);
            preparedStatement.setString(2, "10001502543");
            preparedStatement.setString(3, "Aydin Mathews");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 546.88);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2634);
            preparedStatement.setString(2, "36027925304");
            preparedStatement.setString(3, "Ireland Gonzalez");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 822.45);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2635);
            preparedStatement.setString(2, "48699251549");
            preparedStatement.setString(3, "Wesley Rivera");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 359.05);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2636);
            preparedStatement.setString(2, "98237471479");
            preparedStatement.setString(3, "Cecilia Gamble");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 980.33);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2637);
            preparedStatement.setString(2, "43597204616");
            preparedStatement.setString(3, "Maritza Walters");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 679.93);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2638);
            preparedStatement.setString(2, "13009289860");
            preparedStatement.setString(3, "Christina Glover");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 179.24);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2639);
            preparedStatement.setString(2, "46945322479");
            preparedStatement.setString(3, "Julian Kaufman");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 144.42);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2640);
            preparedStatement.setString(2, "40821434402");
            preparedStatement.setString(3, "Freddy Duke");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 673.53);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2641);
            preparedStatement.setString(2, "46543516581");
            preparedStatement.setString(3, "Bryanna Nielsen");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 153.75);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2642);
            preparedStatement.setString(2, "83758042405");
            preparedStatement.setString(3, "Parker Wolf");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 113.87);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2643);
            preparedStatement.setString(2, "12570816139");
            preparedStatement.setString(3, "Finnegan Lopez");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 713.70);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2644);
            preparedStatement.setString(2, "79555325478");
            preparedStatement.setString(3, "Leonidas Eaton");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 221.53);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2645);
            preparedStatement.setString(2, "34602463272");
            preparedStatement.setString(3, "German Fields");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 485.84);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2646);
            preparedStatement.setString(2, "99683150204");
            preparedStatement.setString(3, "Naima Washington");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 532.37);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2647);
            preparedStatement.setString(2, "53386735888");
            preparedStatement.setString(3, "Lyric Joyce");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 594.13);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2648);
            preparedStatement.setString(2, "23013281403");
            preparedStatement.setString(3, "Simon Parker");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 815.33);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2649);
            preparedStatement.setString(2, "78359133172");
            preparedStatement.setString(3, "Armani Weeks");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 654.19);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2650);
            preparedStatement.setString(2, "47241608874");
            preparedStatement.setString(3, "Kason Banks");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 736.72);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2651);
            preparedStatement.setString(2, "47418613455");
            preparedStatement.setString(3, "Lane Holt");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 723.98);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2652);
            preparedStatement.setString(2, "63106817789");
            preparedStatement.setString(3, "Caroline Morrison");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 574.83);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2653);
            preparedStatement.setString(2, "30969136801");
            preparedStatement.setString(3, "Karlee Higgins");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 807.40);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2654);
            preparedStatement.setString(2, "48193945007");
            preparedStatement.setString(3, "Mollie Page");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 694.05);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2655);
            preparedStatement.setString(2, "38900720885");
            preparedStatement.setString(3, "Yurem Summers");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 426.04);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2656);
            preparedStatement.setString(2, "32016359750");
            preparedStatement.setString(3, "Denisse Duran");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 873.18);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2657);
            preparedStatement.setString(2, "65017143898");
            preparedStatement.setString(3, "Rayna Shepherd");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 832.89);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2658);
            preparedStatement.setString(2, "80035884394");
            preparedStatement.setString(3, "Anastasia Hoffman");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 194.65);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2659);
            preparedStatement.setString(2, "12287472547");
            preparedStatement.setString(3, "Lola Weber");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 889.33);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2660);
            preparedStatement.setString(2, "24550570877");
            preparedStatement.setString(3, "Gavin Castro");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 995.25);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2661);
            preparedStatement.setString(2, "22264240693");
            preparedStatement.setString(3, "Matteo Griffin");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 672.39);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2662);
            preparedStatement.setString(2, "76413211388");
            preparedStatement.setString(3, "Willow Moyer");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 549.50);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2663);
            preparedStatement.setString(2, "17613279726");
            preparedStatement.setString(3, "Ashton Ramsey");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 168.54);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2664);
            preparedStatement.setString(2, "41766183252");
            preparedStatement.setString(3, "Julia Fox");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 665.96);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2665);
            preparedStatement.setString(2, "33829499030");
            preparedStatement.setString(3, "Daniela West");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 518.80);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2666);
            preparedStatement.setString(2, "16398255754");
            preparedStatement.setString(3, "Valeria Heath");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 988.46);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2667);
            preparedStatement.setString(2, "53146609929");
            preparedStatement.setString(3, "Dayana Juarez");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 629.43);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2668);
            preparedStatement.setString(2, "58622209418");
            preparedStatement.setString(3, "Arturo Hebert");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 915.58);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2669);
            preparedStatement.setString(2, "19987309100");
            preparedStatement.setString(3, "Stanley Pitts");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 117.85);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2670);
            preparedStatement.setString(2, "85736032311");
            preparedStatement.setString(3, "Jazmin Forbes");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 377.07);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2671);
            preparedStatement.setString(2, "16602587939");
            preparedStatement.setString(3, "Trevon Bradley");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 791.29);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2672);
            preparedStatement.setString(2, "21765432974");
            preparedStatement.setString(3, "Joaquin Ramirez");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 117.80);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2673);
            preparedStatement.setString(2, "48307536156");
            preparedStatement.setString(3, "Drew Ryan");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 828.30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2674);
            preparedStatement.setString(2, "28932115734");
            preparedStatement.setString(3, "Martin Nolan");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 292.90);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2675);
            preparedStatement.setString(2, "53597952821");
            preparedStatement.setString(3, "Gael Cannon");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 958.53);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2676);
            preparedStatement.setString(2, "39856485962");
            preparedStatement.setString(3, "Daisy Wong");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 335.79);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2677);
            preparedStatement.setString(2, "74697821127");
            preparedStatement.setString(3, "Baylee Quinn");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 921.43);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2678);
            preparedStatement.setString(2, "10567622380");
            preparedStatement.setString(3, "Todd Pineda");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 463.27);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2679);
            preparedStatement.setString(2, "65715857060");
            preparedStatement.setString(3, "Karlie Morse");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 335.23);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2680);
            preparedStatement.setString(2, "18324539274");
            preparedStatement.setString(3, "Ahmad Manning");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 319.17);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2681);
            preparedStatement.setString(2, "84198998749");
            preparedStatement.setString(3, "Lexie Stephens");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 727.30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2682);
            preparedStatement.setString(2, "39817814142");
            preparedStatement.setString(3, "Katelynn Grimes");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 667.38);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2683);
            preparedStatement.setString(2, "70278801887");
            preparedStatement.setString(3, "Timothy Boyer");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 785.10);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2684);
            preparedStatement.setString(2, "46925361972");
            preparedStatement.setString(3, "Ashlyn Drake");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 125.47);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2685);
            preparedStatement.setString(2, "86818569430");
            preparedStatement.setString(3, "Broderick Parks");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 242.31);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2686);
            preparedStatement.setString(2, "50885106966");
            preparedStatement.setString(3, "Devan Moses");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 522.45);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2687);
            preparedStatement.setString(2, "61198351880");
            preparedStatement.setString(3, "Lillianna Carr");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 164.20);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2688);
            preparedStatement.setString(2, "14954770304");
            preparedStatement.setString(3, "Mariam Sparks");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 306.16);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2689);
            preparedStatement.setString(2, "67172224131");
            preparedStatement.setString(3, "Destiny Osborne");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 868.10);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2690);
            preparedStatement.setString(2, "29909291108");
            preparedStatement.setString(3, "Shyanne Patrick");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 599.71);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2691);
            preparedStatement.setString(2, "43747359027");
            preparedStatement.setString(3, "Aubree Hampton");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 406.94);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2692);
            preparedStatement.setString(2, "16273862426");
            preparedStatement.setString(3, "Yair Nunez");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 650.89);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2693);
            preparedStatement.setString(2, "78568299414");
            preparedStatement.setString(3, "Tara Pugh");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 393.56);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2694);
            preparedStatement.setString(2, "33601422553");
            preparedStatement.setString(3, "Shaylee Kennedy");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 258.32);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2695);
            preparedStatement.setString(2, "98206402447");
            preparedStatement.setString(3, "Ramiro Melton");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 386.13);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2696);
            preparedStatement.setString(2, "72204482854");
            preparedStatement.setString(3, "Ashley Fischer");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 123.62);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2697);
            preparedStatement.setString(2, "36534219794");
            preparedStatement.setString(3, "Raegan Bond");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 966.59);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2698);
            preparedStatement.setString(2, "88554179128");
            preparedStatement.setString(3, "Matthias Estes");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 283.17);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2699);
            preparedStatement.setString(2, "25101974870");
            preparedStatement.setString(3, "Kirsten Ali");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 337.25);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2700);
            preparedStatement.setString(2, "65228952166");
            preparedStatement.setString(3, "Lennon Khan");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 511.31);
            preparedStatement.addBatch();
            
            preparedStatement.executeBatch();
            connSistema.commit();
            fechaConexao();
            System.out.println("Registros inseridos na tabela tb_customer_account");
        } catch(SQLException erro){
                System.out.println(erro.getMessage());
                connSistema.rollback();
        }
            
            
    }
    
    private static void inserindoRegistros2() throws Exception{
        try{
            abreConexao();
            
            String sqlBusca = "insert into tb_customer_account (id_customer, "
                            + "cpf_cnpj, nm_customer, is_active, vl_total) values "
                            + "(?,?,?,?,?)";

            PreparedStatement preparedStatement = null;
            preparedStatement = connSistema.prepareStatement(sqlBusca);

            connSistema.setAutoCommit(false);

            preparedStatement.setInt(1, 2701);
            preparedStatement.setString(2, "74374780317");
            preparedStatement.setString(3, "Adonis Knox");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 651.35);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2702);
            preparedStatement.setString(2, "33763536876");
            preparedStatement.setString(3, "Frank Robertson");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 501.34);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2703);
            preparedStatement.setString(2, "61163651349");
            preparedStatement.setString(3, "Finn Mitchell");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 676.59);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2704);
            preparedStatement.setString(2, "10641764829");
            preparedStatement.setString(3, "Bridger Harmon");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 252.03);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2705);
            preparedStatement.setString(2, "33300133381");
            preparedStatement.setString(3, "Kale Camacho");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 972.82);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2706);
            preparedStatement.setString(2, "34958530492");
            preparedStatement.setString(3, "Davis Garrison");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 545.73);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2707);
            preparedStatement.setString(2, "56722117084");
            preparedStatement.setString(3, "Ciara Logan");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 590.88);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2708);
            preparedStatement.setString(2, "16397833067");
            preparedStatement.setString(3, "Deshawn Hull");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 887.36);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2709);
            preparedStatement.setString(2, "83710352003");
            preparedStatement.setString(3, "Gia Frank");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 941.00);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2710);
            preparedStatement.setString(2, "19165924893");
            preparedStatement.setString(3, "Harold Valencia");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 904.23);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2711);
            preparedStatement.setString(2, "26294125386");
            preparedStatement.setString(3, "Journey Salas");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 946.28);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2712);
            preparedStatement.setString(2, "21992955253");
            preparedStatement.setString(3, "Johnathan Terrell");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 649.46);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2713);
            preparedStatement.setString(2, "87305452549");
            preparedStatement.setString(3, "Titus Arias");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 968.29);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2714);
            preparedStatement.setString(2, "94845502594");
            preparedStatement.setString(3, "Liana Bray");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 406.95);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2715);
            preparedStatement.setString(2, "11060490396");
            preparedStatement.setString(3, "Edward Bartlett");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 418.18);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2716);
            preparedStatement.setString(2, "74902517715");
            preparedStatement.setString(3, "Andre Harvey");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 769.79);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2717);
            preparedStatement.setString(2, "44704714253");
            preparedStatement.setString(3, "Natalia Frey");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 950.19);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2718);
            preparedStatement.setString(2, "32279998809");
            preparedStatement.setString(3, "Sebastian Bridges");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 793.41);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2719);
            preparedStatement.setString(2, "64768867838");
            preparedStatement.setString(3, "Danica Morrow");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 515.21);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2720);
            preparedStatement.setString(2, "31126238708");
            preparedStatement.setString(3, "Skylar Hall");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 162.94);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2721);
            preparedStatement.setString(2, "68927632770");
            preparedStatement.setString(3, "Kameron Casey");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 348.79);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2722);
            preparedStatement.setString(2, "44476822623");
            preparedStatement.setString(3, "Ty Donovan");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 443.84);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2723);
            preparedStatement.setString(2, "66341622831");
            preparedStatement.setString(3, "Jamar Diaz");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 443.03);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2724);
            preparedStatement.setString(2, "46492425501");
            preparedStatement.setString(3, "Giovanni Hanson");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 244.89);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2725);
            preparedStatement.setString(2, "85377354883");
            preparedStatement.setString(3, "Areli Beasley");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 760.27);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2726);
            preparedStatement.setString(2, "23939075120");
            preparedStatement.setString(3, "Quinn Rogers");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 920.04);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2727);
            preparedStatement.setString(2, "42361560064");
            preparedStatement.setString(3, "Carlie Dudley");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 390.65);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2728);
            preparedStatement.setString(2, "12566242595");
            preparedStatement.setString(3, "Adeline Brown");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 260.51);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2729);
            preparedStatement.setString(2, "33751734390");
            preparedStatement.setString(3, "Ricky Ayala");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 496.59);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2730);
            preparedStatement.setString(2, "44335927972");
            preparedStatement.setString(3, "Cordell Rose");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 989.32);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2731);
            preparedStatement.setString(2, "10155328263");
            preparedStatement.setString(3, "Harley Burns");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 810.34);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2732);
            preparedStatement.setString(2, "68725464704");
            preparedStatement.setString(3, "Fisher Pham");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 783.03);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2733);
            preparedStatement.setString(2, "80448334096");
            preparedStatement.setString(3, "Karsyn Fuller");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 862.15);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2734);
            preparedStatement.setString(2, "71516428967");
            preparedStatement.setString(3, "Jovan Shah");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 500.08);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2735);
            preparedStatement.setString(2, "73822900118");
            preparedStatement.setString(3, "Kobe Salazar");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 613.96);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2736);
            preparedStatement.setString(2, "11283767438");
            preparedStatement.setString(3, "Ali Carlson");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 836.16);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2737);
            preparedStatement.setString(2, "98704634149");
            preparedStatement.setString(3, "Zoe Huang");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 276.94);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2738);
            preparedStatement.setString(2, "78987305377");
            preparedStatement.setString(3, "Irene Deleon");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 461.69);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2739);
            preparedStatement.setString(2, "44454396731");
            preparedStatement.setString(3, "Damion Townsend");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 119.51);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2740);
            preparedStatement.setString(2, "50962636430");
            preparedStatement.setString(3, "Sophie Douglas");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 873.96);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2741);
            preparedStatement.setString(2, "40311302160");
            preparedStatement.setString(3, "Maleah Richardson");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 936.46);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2742);
            preparedStatement.setString(2, "64054648318");
            preparedStatement.setString(3, "Emilio Buckley");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 456.63);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2743);
            preparedStatement.setString(2, "12683676611");
            preparedStatement.setString(3, "Amelie Chan");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 683.10);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2744);
            preparedStatement.setString(2, "28970497753");
            preparedStatement.setString(3, "Kathy Wiggins");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 512.54);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2745);
            preparedStatement.setString(2, "49988473792");
            preparedStatement.setString(3, "Jan Horton");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 258.19);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2746);
            preparedStatement.setString(2, "48355368384");
            preparedStatement.setString(3, "Mekhi Bentley");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 597.81);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2747);
            preparedStatement.setString(2, "94300989677");
            preparedStatement.setString(3, "Adan Collins");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 568.95);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2748);
            preparedStatement.setString(2, "65730631799");
            preparedStatement.setString(3, "Emmy Mcpherson");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 111.30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2749);
            preparedStatement.setString(2, "49884753552");
            preparedStatement.setString(3, "Rylee Navarro");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 864.40);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2750);
            preparedStatement.setString(2, "73344829837");
            preparedStatement.setString(3, "Felix Strickland");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 359.41);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2751);
            preparedStatement.setString(2, "34171642658");
            preparedStatement.setString(3, "Alexa Bowers");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 311.61);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2752);
            preparedStatement.setString(2, "86845727496");
            preparedStatement.setString(3, "Jazlene Parsons");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 645.99);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2753);
            preparedStatement.setString(2, "58270097823");
            preparedStatement.setString(3, "Monica Whitney");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 330.38);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2754);
            preparedStatement.setString(2, "23219401237");
            preparedStatement.setString(3, "Raiden Fitzgerald");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 603.35);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2755);
            preparedStatement.setString(2, "60897476243");
            preparedStatement.setString(3, "Marely Hurst");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 185.36);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2756);
            preparedStatement.setString(2, "18050207522");
            preparedStatement.setString(3, "William Lowe");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 789.16);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2757);
            preparedStatement.setString(2, "26720690943");
            preparedStatement.setString(3, "Leonel May");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 677.35);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2758);
            preparedStatement.setString(2, "33489848964");
            preparedStatement.setString(3, "Malik Chase");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 207.82);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2759);
            preparedStatement.setString(2, "41818682829");
            preparedStatement.setString(3, "Jaylan Weiss");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 489.41);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2760);
            preparedStatement.setString(2, "27245779091");
            preparedStatement.setString(3, "Khalil Glass");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 481.41);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2761);
            preparedStatement.setString(2, "69553943965");
            preparedStatement.setString(3, "Cristofer Vang");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 869.64);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2762);
            preparedStatement.setString(2, "76338137513");
            preparedStatement.setString(3, "Anne Knight");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 337.92);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2763);
            preparedStatement.setString(2, "58175681271");
            preparedStatement.setString(3, "Bentley Savage");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 831.32);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2764);
            preparedStatement.setString(2, "28407757694");
            preparedStatement.setString(3, "Kathryn Long");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 695.23);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2765);
            preparedStatement.setString(2, "70712938691");
            preparedStatement.setString(3, "Zachary Dodson");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 890.76);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2766);
            preparedStatement.setString(2, "30791525913");
            preparedStatement.setString(3, "Erika Proctor");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 622.27);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2767);
            preparedStatement.setString(2, "71298129681");
            preparedStatement.setString(3, "Ralph Ellison");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 576.40);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2768);
            preparedStatement.setString(2, "58060199721");
            preparedStatement.setString(3, "Kennedi Calderon");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 970.31);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2769);
            preparedStatement.setString(2, "30368723678");
            preparedStatement.setString(3, "Hadley Sweeney");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 850.75);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2770);
            preparedStatement.setString(2, "33179378779");
            preparedStatement.setString(3, "Alexus Cantu");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 258.86);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2771);
            preparedStatement.setString(2, "24904610011");
            preparedStatement.setString(3, "Olivia Trujillo");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 569.95);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2772);
            preparedStatement.setString(2, "33722350632");
            preparedStatement.setString(3, "Aileen Zimmerman");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 200.83);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2773);
            preparedStatement.setString(2, "35314570634");
            preparedStatement.setString(3, "Jeremiah Sloan");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 548.57);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2774);
            preparedStatement.setString(2, "51744248017");
            preparedStatement.setString(3, "Katelyn Park");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 473.98);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2775);
            preparedStatement.setString(2, "71744487357");
            preparedStatement.setString(3, "Milagros Mathis");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 452.73);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2776);
            preparedStatement.setString(2, "36739703306");
            preparedStatement.setString(3, "Alma Horn");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 755.72);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2777);
            preparedStatement.setString(2, "43075029769");
            preparedStatement.setString(3, "Rory Delacruz");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 167.49);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2778);
            preparedStatement.setString(2, "19599006480");
            preparedStatement.setString(3, "Samuel Dyer");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 800.68);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2779);
            preparedStatement.setString(2, "40077108840");
            preparedStatement.setString(3, "Ryan Oconnor");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 613.88);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2780);
            preparedStatement.setString(2, "30121124799");
            preparedStatement.setString(3, "Hanna Browning");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 548.55);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2781);
            preparedStatement.setString(2, "18826432037");
            preparedStatement.setString(3, "Haiden Mack");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 587.92);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2782);
            preparedStatement.setString(2, "95151149831");
            preparedStatement.setString(3, "Madeline Carson");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 734.55);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2783);
            preparedStatement.setString(2, "58120804666");
            preparedStatement.setString(3, "Faith Olson");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 315.26);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2784);
            preparedStatement.setString(2, "42601756938");
            preparedStatement.setString(3, "Amina Crane");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 856.31);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2785);
            preparedStatement.setString(2, "53501562333");
            preparedStatement.setString(3, "Lewis Conrad");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 181.83);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2786);
            preparedStatement.setString(2, "47730609351");
            preparedStatement.setString(3, "Tristen Jenkins");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 308.46);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2787);
            preparedStatement.setString(2, "95298066653");
            preparedStatement.setString(3, "Marissa Woodward");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 442.53);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2788);
            preparedStatement.setString(2, "25336493167");
            preparedStatement.setString(3, "Anahi Day");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 258.33);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2789);
            preparedStatement.setString(2, "34680098965");
            preparedStatement.setString(3, "Shelby Davidson");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 497.43);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2790);
            preparedStatement.setString(2, "21550989552");
            preparedStatement.setString(3, "Scarlet Good");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 229.73);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2791);
            preparedStatement.setString(2, "74164776336");
            preparedStatement.setString(3, "Felipe Miranda");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 145.14);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2792);
            preparedStatement.setString(2, "52392513172");
            preparedStatement.setString(3, "Amirah Patel");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 905.69);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2793);
            preparedStatement.setString(2, "71632337086");
            preparedStatement.setString(3, "Kellen Reynolds");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 187.09);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2794);
            preparedStatement.setString(2, "59033039579");
            preparedStatement.setString(3, "Jaydin George");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 892.30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2795);
            preparedStatement.setString(2, "96419895130");
            preparedStatement.setString(3, "Yasmine Nixon");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 429.27);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2796);
            preparedStatement.setString(2, "71729123628");
            preparedStatement.setString(3, "Dalton Mccarthy");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 184.13);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2797);
            preparedStatement.setString(2, "50263790532");
            preparedStatement.setString(3, "Brielle Mahoney");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 639.81);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2798);
            preparedStatement.setString(2, "68254161216");
            preparedStatement.setString(3, "Dayami Atkins");
            preparedStatement.setInt(4, 1);
            preparedStatement.setDouble(5, 536.10);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2799);
            preparedStatement.setString(2, "52496831260");
            preparedStatement.setString(3, "Michelle Gutierrez");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 329.50);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2800);
            preparedStatement.setString(2, "70031853806");
            preparedStatement.setString(3, "Ariel Horne");
            preparedStatement.setInt(4, 0);
            preparedStatement.setDouble(5, 151.41);
            preparedStatement.addBatch();
            
            preparedStatement.executeBatch();
            connSistema.commit();
            
            fechaConexao();
            System.out.println("Registros inseridos na tabela tb_customer_account");
        } catch(SQLException erro){
                System.out.println(erro.getMessage());
                connSistema.rollback();
        }
            
            
    }
    
    private static void funcaoCalculoMedia() throws Exception{
        try{
            abreConexao();
            
            Statement stmt = connSistema.createStatement();
            int columnsNumber = 0;
            /*- Após a inserção, percorra os objetos e calcule a média do 
            campo vl_total apenas para os itens que este valor seja maior que 
            560 e o campo id_customer esteja entre 1500 e 2700.*/
            
            String sqlBusca = "SELECT AVG(vl_total) AS media_salario FROM "
                    + "ultrasi_bancoultrasi.tb_customer_account WHERE vl_total > 560 AND "
                    + "id_customer > 1500 AND id_customer < 2700 ";
            
            ResultSet rs = stmt.executeQuery(sqlBusca);
            ResultSetMetaData rsmd = rs.getMetaData();
            rsmd.getColumnCount();
            columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }   
            
            
            
            //- Exiba a média final
            
            sqlBusca = "SELECT AVG(vl_total) AS media_final "
                    + "FROM ultrasi_bancoultrasi.tb_customer_account ";
            
            rs = stmt.executeQuery(sqlBusca);
            rsmd = rs.getMetaData();
            
            rsmd.getColumnCount();
            columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }
            
            
            
            
            
            /*- Imprima cada um dos clientes utilizados para o cálculo da média, 
            ordenando do maior para o menor saldo*/
            
            sqlBusca = "SELECT * FROM ultrasi_bancoultrasi.tb_customer_account "
                    + "WHERE vl_total > 560 AND id_customer > 1500 "
                    + "AND id_customer < 2700 order by  vl_total desc ";
            
            rs = stmt.executeQuery(sqlBusca);
            rsmd = rs.getMetaData();
            
            rsmd.getColumnCount();
            columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }
            
            
            
             
            
            fechaConexao();
        }catch (SQLException erro){
            System.out.println("Erro na funcaoCalculoMedia. ERRO ORIGINAL: " 
            + erro.getMessage());
        }
        
            
            
            
    }
    
    private static void abreConexao()throws Exception{
        try{
            Class.forName(DB_DRIVER);
            connSistema = DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);//colar parametros: caminho / usuario / senha
            System.out.println("Conexão Estabelecida");
        }catch(SQLException erro){
            throw new Exception(mensagem + erro.getMessage());
          
        }//fechando try
      
  }//fechando abreconexao
    
    private static void fechaConexao()throws Exception{
        try{
            connSistema.close();
            System.out.println("Conexão Encerrada");
        }catch(SQLException erro){
            throw new Exception("Não existem conexões de BD ativas para este programa.ERRO ORIGINAL: " + erro.getMessage());
        }//fechando try
      
    }//fechando fechaconexao
    
}
