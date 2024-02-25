class SY2022bit017 {
    public static void main(String[] args) {
        String[] registrations = {"2022BCS001", "2022BIT002", "2022BCH003", "2022BME004"};
        SY2022bit017 regNumbers = new SY2022bit017();
        int validCount = regNumbers.getValidRegistrationsCount(registrations);
        System.out.println("Count of valid registrations: " + validCount);
        
        int regNo = regNumbers.countRegistration(registrations);
        System.out.println("Count of reg less than 50: " + regNo);
        
        int results = regNumbers.countRegistrationNo(registrations);
        System.out.println("Count of reg less than 50: " + results);
    }

    public int getValidRegistrationsCount(String[] registrations) {
        String[] validDepartments = {"BCS", "BIT", "BCH", "BME"};

        int validCount = 0;
        
        for (String registration : registrations) {
            String[] parts = registration.split("(?<=\\G.{3})");
            if (parts.length == 3) {
                for (String department : validDepartments) {
                    if (parts[1].equals(department)) {
                        validCount++;
                        break;
                    }
                    
                       
                }
            }
        }
        return validCount;
    }
    public int countRegistration(String[] registrations)
    {
        
        int regNo = 0;
        int result ;
        for (String registration : registrations) 
        {
           result = registration.charAt(8);
           if(result < 5 )
           {
               regNo++;
           }
        }
        return regNo;
         
    }
    public int countRegistrationNo(String[] registrations)
    {
        
        int regNo = 0;
        int results ;
        for (String registration : registrations) 
        {
           results = registration.indexAt(8);
           if(results < 5 )
           {
               results++;
           }
        }
        return results;
         
    }
    
    
    
}
