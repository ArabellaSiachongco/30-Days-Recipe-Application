package com.example.scratchwithrecycleview

import TipAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.samplescroll.Tip
import com.example.scratchwithrecycleview.R



class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var tipAdapter: TipAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val tips = listOf(
            Tip(1, "Easy One-Pan Dinners", R.drawable.day1, "Start simple with a one-pan meal like roasted chicken with vegetables. Toss chicken thighs, potatoes, and carrots in olive oil, garlic, and rosemary, then bake for 40 minutes."),
            Tip(2, "Quick Pasta Fix", R.drawable.day2, "Try a 15-minute garlic butter pasta with spinach. Sauté garlic in butter, toss in cooked pasta, spinach, and parmesan for a deliciously simple meal."),
            Tip(3, "Fresh Salads", R.drawable.day3, "Make a refreshing Greek salad. Combine tomatoes, cucumbers, olives, feta, and a drizzle of olive oil with lemon juice and oregano."),
            Tip(4, "Comfort Soups", R.drawable.day4, "Create a hearty minestrone soup with beans, pasta, and vegetables simmered in a tomato-based broth."),
            Tip(5, "Meatless Mondays", R.drawable.day5, "Prepare a satisfying vegetable stir-fry with tofu. Stir-fry bell peppers, broccoli, and tofu in a soy-ginger sauce."),
            Tip(6, "Breakfast Anytime", R.drawable.day6, "Whip up an easy shakshuka with poached eggs in a spicy tomato sauce, perfect for breakfast or dinner."),
            Tip(7, "Mexican Night", R.drawable.day7, "Make chicken fajitas by sautéing onions, bell peppers, and chicken strips in fajita seasoning. Serve with warm tortillas."),
            Tip(8, "Mediterranean Delights", R.drawable.day8, "Enjoy a Mediterranean grain bowl with quinoa, roasted vegetables, hummus, and a drizzle of tahini dressing."),
            Tip(9, "Sheet Pan Magic", R.drawable.day9, "Roast salmon and asparagus with lemon and garlic for an easy, healthy sheet pan dinner."),
            Tip(10, "Cozy Casseroles", R.drawable.day10, "Bake a creamy tuna noodle casserole with pasta, peas, and a crunchy breadcrumb topping."),
            Tip(11, "Asian-Inspired", R.drawable.day11, "Cook a simple sesame ginger stir-fry with shrimp, broccoli, and snow peas."),
            Tip(12, "Taco Tuesday", R.drawable.day12, "Assemble fish tacos with grilled fish, a cabbage slaw, and a squeeze of lime."),
            Tip(13, "Slow Cooker Comfort", R.drawable.day13, "Set your slow cooker to make beef stew. Combine chunks of beef, potatoes, carrots, and broth, and let it cook slowly for tender results."),
            Tip(14, "Light and Fresh", R.drawable.day14, "Enjoy a refreshing cucumber and avocado salad with lime dressing."),
            Tip(15, "Italian Classics", R.drawable.day15, "Cook a classic spaghetti carbonara with pancetta, eggs, and parmesan."),
            Tip(16, "Weeknight Pizza", R.drawable.day16, "Create a quick homemade pizza using pre-made dough, tomato sauce, mozzarella, and your favorite toppings."),
            Tip(17, "5-Ingredient Recipes", R.drawable.day17, "Try an easy chicken piccata with lemon, capers, butter, and a side of pasta."),
            Tip(18, "Asian Noodles", R.drawable.day18, "Make peanut noodles by tossing soba noodles in a creamy peanut butter and soy sauce dressing, topped with shredded carrots."),
            Tip(19, "Soup and Sandwiches", R.drawable.day19, "Pair a grilled cheese sandwich with tomato soup for the ultimate comfort food combo."),
            Tip(20, "Healthy Bowls", R.drawable.day20, "Build a healthy grain bowl with brown rice, black beans, avocado, corn, and salsa."),
            Tip(21, "Kid-Friendly Meals", R.drawable.day21, "Prepare a fun homemade mac and cheese with a creamy cheese sauce and crispy breadcrumb topping."),
            Tip(22, "French-Inspired", R.drawable.day22, "Cook a classic coq au vin, braising chicken in red wine with mushrooms and onions."),
            Tip(23, "Mediterranean Soup", R.drawable.day23, "Serve a mezze platter with hummus, baba ghanoush, olives, and pita."),
            Tip(24, "Instant Pot Magic", R.drawable.day24, "Make an Instant Pot chicken curry with coconut milk, curry powder, and tender chicken."),
            Tip(25, "Vegan Delights", R.drawable.day25, "Cook a hearty lentil stew with tomatoes, spinach, and plenty of spices."),
            Tip(26, "Brunch Favorites", R.drawable.day26, "Bake fluffy blueberry pancakes, perfect for a weekend brunch."),
            Tip(27, "Italian Comfort", R.drawable.day27, "Create a rich lasagna with layers of ricotta, mozzarella, marinara, and ground beef."),
            Tip(28, "Mediterranean Wraps", R.drawable.day28, "Make a falafel wrap with crispy falafel, lettuce, tomatoes, and tzatziki in pita bread."),
            Tip(29, "Sweet Treats", R.drawable.day29, "Bake a simple batch of chocolate chip cookies for dessert."),
            Tip(30, "Global Fusion", R.drawable.day30, "Try Korean BBQ tacos with grilled marinated beef, kimchi, and spicy mayo.")
        )


        tipAdapter = TipAdapter(tips)
        recyclerView.adapter = tipAdapter

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
