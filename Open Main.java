public static void main(String[] args) {
    int choice = 4; 
    switch (choice) {
        case 4:
            SeleniumOperations.open_chrome_loadpage_resize_close();
            break;
        default:
            System.out.println("Invalid choice.");
    }
}
