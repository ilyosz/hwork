import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Worker work = new Worker();
        Active active=new Active();
        ArrayList<Client> users = new ArrayList<Client>();
        ArrayList<Client> work1 = new ArrayList<Client>();
        ArrayList<Client> act = new ArrayList<Client>();
        int id;
        int i = 1;
        int i1 = 1;
        while (true) {
            int a = menu.mainMenu();
            switch (a) {
                case 1: {
                    System.out.println("register as client-1" + "\n" + "register as client-worker (get additional 1 percent)");
                    Scanner scan6 = new Scanner(System.in);
                    int y = scan6.nextInt();
                    if (y == 1) {
                        Client client = new Client();
                        System.out.println("Write FullName:");
                        String a1;
                        Scanner sa = new Scanner(System.in);
                        a1 = sa.nextLine();
                        client.setFullName(a1);
                        System.out.println("your cash:");
                        int a2;
                        Scanner sa1 = new Scanner(System.in);
                        a2 = sa1.nextInt();
                        client.setCash(a2, 0);
                        client.setId(i);
                        System.out.println("ur id is " + i);
                        i++;
                        users.add(client);

                    }
                    else if (y == 2) {
                        System.out.println("we are gonna add 1 percent of ur money automatically.");
                        System.out.println("Write Fullname:");
                        Scanner scan7 = new Scanner(System.in);
                        String fn = scan7.nextLine();
                        work.setFullName(fn);
                        System.out.println("Write cash");
                        Scanner scan9 = new Scanner(System.in);
                        int z = scan9.nextInt();
                        work.setCash(z, z / 100);
                        work.setId(i1);
                        System.out.println("id" + i1);
                        i1++;
                        work1.add(work);

                    }
                }
                break;
                case 2: {
                    System.out.println("Worker-1 Client-2 Active-3");
                    Scanner f = new Scanner(System.in);
                    int h = f.nextInt();
                    if (h == 2) {
                        System.out.println("Please enter id of users");
                        Scanner scanner = new Scanner(System.in);
                        int id1 = scanner.nextInt();
                        if (id1 >= 1 && id1 <= i) {
                            id = id1;
                            System.out.println(users.get(id - 1).toString());
                        }
                    } else if (h == 1) {
                        System.out.println("enter id");
                        Scanner new1 = new Scanner(System.in);
                        int hd = new1.nextInt();
                        if (hd >= 1 && hd <= 9) {
                            int id2 = hd;
                            System.out.println(work1.get(id2 - 1).toString());
                        }
                    }
                    else if(h == 3){
                        System.out.println("id:");
                        Scanner r = new Scanner(System.in);
                        int r1=r.nextInt();
                        if (r1 >= 1 && r1 <= i1){
                            int r3=r1;
                            System.out.println(act.get(r3 - 1).toString());
                        }
                    }
                }
                break;
                case 3: {
                    int z1;
                    System.out.println("ur id");
                    Scanner id1 = new Scanner(System.in);
                    int id12 = id1.nextInt();

                    if (id12 > 0) {
                        id = id12;
                        System.out.println("select 1 to add money" + "\n" + "select 2 to get money from your balance");
                        Scanner z2 = new Scanner(System.in);
                        z1 = z2.nextInt();
                        if (z1 == 1) {
                            System.out.println("money:");
                            Scanner q = new Scanner(System.in);
                            int w = q.nextInt();
                            users.get(id - 1).setCash1(w);
                            System.out.println("money has been already added check it. select 2");
                        } else if (z1 == 2) {
                            System.out.println("money:");
                            Scanner e = new Scanner(System.in);
                            int t = e.nextInt();
                            users.get(id - 1).setCash12(t);
                            System.out.println("you have already got money. check your balance. select 2");
                        }
                    }
                }
                break;
                case 4: {
                    System.out.println("u lost 90 percent of ur money and add 1 percent every month");
                    System.out.println("choose 1-yes 2-no");
                    Scanner yes = new Scanner(System.in);
                    int yes1 = yes.nextInt();
                    if (yes1 == 1) {
                        System.out.println("who are you worker(1) or client(2)");
                        Scanner l = new Scanner(System.in);
                        int a0 = l.nextInt();
                        int o=1;
                        if (a0 == 2) {
                            System.out.println("okay lets continue. ur id");
                            Scanner new1 = new Scanner(System.in);
                            int hd = new1.nextInt();
                            if (hd >= 1 && hd <= i1) {
                                int id2 = hd;
                                users.get(id2 - 1).setCash(users.get(id2 - 1).getCash(), -90 * users.get(id2 - 1).getCash() / 100);
                                active.setFullName(users.get(id2-1).getFullName());
                                active.setCash(users.get(id2-1).getCash(),0);
                                active.setId(o);
                                System.out.println("ur account activated check ur balance ur id " + o);
                                act.add(active);
                            }
                        } else if (a0 == 1) {
                            System.out.println("okay lets continue. ur id1");
                            Scanner new12 = new Scanner(System.in);
                            int hd1 = new12.nextInt();
                            if (hd1 >= 1 && hd1 <= i1) {
                                int id23 = hd1;
                                work1.get(id23 - 1).setCash(work1.get(id23 - 1).getCash(), -90 * work1.get(id23 - 1).getCash() / 100);
                                System.out.println("ur account activated check ur balance. everyday you get 1 percent of ur money");
                                active.setCash(work1.get(id23-1).getCash(),0);
                                active.setFullName(work1.get(id23-1).getFullName());
                                active.setId(o);
                                System.out.println("ur new id is  " + o);
                                act.add(active);
                            }
                        }
                        o++;
                    }
                }
            }
        }
    }
}
