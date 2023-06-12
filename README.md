# Smoothie Shop Assignment
Requirements (feel free to enhance the features based on your availability):

# Business Owner:
1. List all existing Smoothies
2. View a Smoothies details
          Basic details
          Nutrition values
3. Edit Smoothies details
4. Delete Smoothies details

# End User:
1. List all existing Smoothies
2. Read details of Smoothies
3. Order online

# Endpoints:
1. List all existing Smoothies - http://localhost:8080/smoothieshop/common/smoothies
2. View a Smoothie Details - http://localhost:8080/smoothieshop/business?name=Blueberry Smoothie
3. Insert a Smoothie Details - http://localhost:8080/smoothieshop/business/insertSmoothieDetails
4. Insert Multiple Smoothie Details - http://localhost:8080/smoothieshop/business/insertMultipleSmoothieDetails
5. Edit a Smoothie Details - http://localhost:8080/smoothieshop/business/editSmoothieDetails
6. Delete a Smoothie - http://localhost:8080/smoothieshop/business/deleteSmoothie/Pineapple Smoothie
7. Read All Smoothie Details - http://localhost:8080/smoothieshop/user/smoothieDetails
8. Order Online - http://localhost:8080/smoothieshop/user/orderOnline

# UI Design:
1. Welcome Page - Business & User
2. Click Business -> Available Smoothies (Business Page) -> Smoothie List (View, Edit, Delete, View All Details). Click View to View each Smoothie. Click Edit to Edit each Smoothie. Click Delete to Delete each Smoothie. Click View All Details to View all Smoothie Details.
3. Click User -> Available Smoothies (User Page) -> Smoothie List (View All Details). Click View All Details to View all Smoothie Details.

# Open API Specification:
http://localhost:8080/swagger-ui/index.html

# Out of Scope:
1. Role Based Backend Authorization.
2. UI Screen of Order Online (Cart System).
