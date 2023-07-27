Feature:User wants to place an order

Scenario:Search Item
Given User is in home page
When user search an item
Then item should display

Scenario:Add Item to Cart
Given Item must display
When we add item
Then Item should be added to cart