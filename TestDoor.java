import java.util.Scanner;

class Door{
    public boolean isOpen = false;

    public void openDoor(){
        if(!isOpen){
            System.out.println("Door opened");
            isOpen = true;
        }else{
            System.out.println("Door already open!");
        }
    }

    public void closeDoor(){
        if(isOpen){
            System.out.println("Door closed");
            isOpen = false;
        }else{
            System.out.println("Door already closed!");
        }
    }
}

class DoorWithLock extends Door{
    public boolean isLocked = false;

    @Override
    public void openDoor(){
        if (!super.isOpen && isLocked){
            System.out.println("“Door is locked and cannot be opened!");
        }else{
            super.openDoor();
        }
    }

    public void lockDoor(){
        if (super.isOpen){
            System.out.println("Open door cannot be locked!");
        } else if (isLocked){
            System.out.println("Door already locked!");
        } else {
            System.out.println("Door locked");
            isLocked = true;
        }
    }

    public void unlockDoor(){
        if(!super.isOpen && !isLocked){
            System.out.println("Door is not locked!");
        }else{
            System.out.println("Door unlocked");
            isLocked = false;
        }
    }
}

class DoorWithCodeLock extends DoorWithLock{
    private int code = 0;

    @Override
    public void lockDoor(){
        if (!super.isOpen && !isLocked){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the code to lock the door:");
            code = scanner.nextInt();
            // scanner.close();
            super.lockDoor();

        }else{
            super.lockDoor();
        }
    }

    @Override
    public void unlockDoor(){
        if (isLocked){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the code to unlock the door:");
            int code2 = scanner.nextInt();
            if (code2 == code){
                super.unlockDoor();
            }else{
                System.out.println("Invalid unlock code!");
            }
            // scanner.close();
        }else{
            super.unlockDoor();
        }
    }
}

public class TestDoor{
    public static void main(String[] args){
        DoorWithCodeLock door = new DoorWithCodeLock();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while(choice != 5){
            System.out.println("Enter your choice: \n 1: Open door \n 2: Close door \n 3: Lock door \n 4: Unlock door \n 5: Exit");
        choice = scanner.nextInt();
        
        switch(choice){
            case 1:
                door.openDoor();
                break;
            case 2:
                door.closeDoor();
                break;
            case 5:
                System.out.println("Exit!");
                break;
            case 3:
                door.lockDoor();
                break;
            case 4:
                door.unlockDoor();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
            }
        }
        scanner.close();
    }
}