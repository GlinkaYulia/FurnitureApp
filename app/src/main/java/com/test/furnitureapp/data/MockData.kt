package com.test.furnitureapp.data

object MockData {

    fun getProducts(): List<Product>{
        return listOf(
            Product(
                id = 1,
                name = "Green velvet sofa",
                price = 450.0,
                description = "Cozy modern fabric sofa with 2 seats and chaise longue. Timeless design and wonderfully comfy.",
                category = "Sofas",
                rating = 4.6,
                imageUrl = "https://www.ikea.com/us/en/images/products/paerup-sofa-gunnared-dark-green__1019183_pe831388_s5.jpg"
            ),
            Product(
                id = 2,
                name = "Leather brown sofa",
                price = 1800.0,
                description = "Classic leather sofa for your living room.",
                category = "Sofas",
                rating = 5.0,
                imageUrl = "https://www.ikea.com/us/en/images/products/landskrona-sofa-grann-bomstad-golden-brown-metal__0825368_pe776269_s5.jpg"
            ),
            Product(
                id = 3,
                name = "Yellow fabric sofa",
                price = 500.0,
                description = "Bright and cheerful sofa to light up your room.",
                category = "Sofas",
                rating = 4.2,
                imageUrl = "https://www.ikea.com/ca/en/images/products/vimle-sofa-gunnared-beige__0514336_pe639436_s5.jpg" // Замінив на бежевий для прикладу, або знайди жовтий
            ),
            Product(
                id = 4,
                name = "Gray modern sofa",
                price = 850.0,
                description = "Perfect simplistic design.",
                category = "Sofas",
                rating = 4.0,
                imageUrl = "https://www.ikea.com/us/en/images/products/finnala-sofa-gunnared-medium-gray__0808386_pe770636_s5.jpg"
            )
        )
    }
}