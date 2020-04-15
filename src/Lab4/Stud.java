package Lab4;

import java.util.Scanner;

class Stud 
{
    private int i = 0;
    private University[] o = {new Certificate(), new Offset(), new StudentExam()};
    private Scanner scan = new Scanner(System.in);

    public void start() 
    {
        while (i != 10) 
        {
            try 
            {
                System.out.println();
                System.out.println("============MENU============");
                System.out.println("�������� ��������");
                System.out.println("1 - ������� �������� � ��������� ��� �������");
                System.out.println("2 - �������� ���� ��������� � ��������");
                System.out.println("3 - ��������� ���� ���������");
                System.out.println("4 - �������� ����������");
                System.out.println("5 - �������� ��� ����������");
                System.out.println("6 - ������� ��� ����������");
                System.out.println("7 - �������� �����");
                System.out.println("8 - �������� ��� ������");
                System.out.println("9 - ������� ��� ������");
                System.out.println("10 - ����� �� ���������"); 
                System.out.println("============MENU============");
                System.out.println();
                i = scan.nextInt();
                
                switch (i) 
                {                       
                    case 1:
                        o[2].CreateStudentExam();
                        break;
                        
                    case 2:
                        o[2].InfoStudentExam();
                        break;
                        
                    case 3:
                        o[2] = new StudentExam();
                        System.out.println("������!");
                        break;
                        
                    case 4:
                        o[0].Create();
                        break;
                        
                    case 5:
                        o[0].Info();
                        break;
                        
                    case 6:
                        o[0] = new Certificate();
                        System.out.println("������!");
                        break;
                        
                    case 7:
                        o[1].Create();
                        break;
                        
                    case 8:
                        o[1].Info();
                        break;
                        
                    case 9:
                        o[1] = new Offset();
                        System.out.println("������!");
                        break;
                        
                    case 10:
                        System.out.println("��������� ���������");
                        break;
                             
                    default:
                        System.out.println("������� ������ �� ����������!!!");
                        break;
                        
                }
            } 
            catch (Exception ex) 
            {
                System.out.println("������� ����� �� ����������!!!");
                scan.next();
            }
        }
    }
}

