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
3. Edit a Smoothie Details - http://localhost:8080/smoothieshop/business/editSmoothieDetails
          {
        "id": 1,
        "name": "Blueberry Smoothie",
        "basicSmoothieDetails": {
            "description": "Edit, banana, coconut water, yogurt and flax seeds turns this into one nutrient-dense smoothie that boasts tons of antioxidant benefits",
            "ingredients": "Blueberries, banana, coconut water, yogurt and flax seeds",
            "price": 10.0
        },
        "nutritionSmoothieDetails": {
            "calories": 0.0,
            "fat": 0.0,
            "cholesterol": 0.0,
            "sodium": 29.0,
            "potassium": 24.0,
            "protein": 1.2
        }
}
4. Delete a Smoothie - http://localhost:8080/smoothieshop/business/deleteSmoothie/Pineapple Smoothie
5. Read All Smoothie Details - http://localhost:8080/smoothieshop/user/smoothieDetails
6. Order Online - http://localhost:8080/smoothieshop/user/orderOnline
          ["Pineapple Smoothie", "Blueberry Smoothie"]

