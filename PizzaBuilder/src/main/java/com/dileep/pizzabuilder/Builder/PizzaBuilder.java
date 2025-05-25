package com.dileep.pizzabuilder.Builder;


public class PizzaBuilder {

    public static class Builder {
        // dough options
        private String doughType;
        private String doughSize;
        private String edgeStyle;
        private String fermentationType;
        // sauce options
        private String sauceType;
        private String sauceAmount;
        private String sauceLayering;
        //cheese options
        private String cheeseType;
        private String cheeseAmount;

        public PizzaBuilder build() {
            return new PizzaBuilder(this);
        }

        public Builder doughType(String doughType) {
            this.doughType = doughType;
            return this;
        }

        public Builder doughSize(String doughSize) {
            this.doughSize = doughSize;
            return this;
        }

        public Builder edgeStyle(String edgeStyle) {
            this.edgeStyle = edgeStyle;
            return this;
        }

        public Builder fermentationType(String fermentationType) {
            this.fermentationType = fermentationType;
            return this;
        }

        public Builder sauceType(String sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        public Builder sauceAmount(String sauceAmount) {
            this.sauceAmount = sauceAmount;
            return this;
        }

        public Builder sauceLayering(String sauceLayering) {
            this.sauceLayering = sauceLayering;
            return this;
        }

        public Builder cheeseType(String cheeseType) {
            this.cheeseType = cheeseType;
            return this;
        }

        public Builder cheeseAmount(String cheeseAmount) {
            this.cheeseAmount = cheeseAmount;
            return this;
        }

    }

    // dough options
    private String doughType;         // e.g., "Thin Crust", "Thick Crust", "Gluten-Free"
    private String doughSize;         // e.g., "Small", "Medium", "Large", "Extra Large"
    private String edgeStyle;         // e.g., "Cheese-Stuffed", "Garlic-Buttered", "Crispy"
    private String fermentationType;  // e.g., "Regular", "Sourdough", "High Hydration"
    // sauce options
    private String sauceType;         // e.g., "Tomato", "BBQ", "White Sauce", "No Sauce"
    private String sauceAmount;       // e.g., "Light", "Regular", "Extra"
    private String sauceLayering;     // e.g., "Under Cheese", "Over Cheese", "Swirled"
    //cheese options
    private String cheeseType;   // e.g., "Mozzarella", "Cheddar", "Vegan", "Parmesan"
    private String cheeseAmount; // e.g., "Light", "Regular", "Extra"

    public PizzaBuilder(Builder builder) {
        this.doughType = builder.doughType;
        this.doughSize = builder.doughSize;
        this.edgeStyle = builder.edgeStyle;
        this.fermentationType = builder.fermentationType;

        this.sauceType = builder.sauceType;
        this.sauceAmount = builder.sauceAmount;
        this.sauceLayering = builder.sauceLayering;

        this.cheeseType = builder.cheeseType;
        this.cheeseAmount = builder.cheeseAmount;
    }

    public String describePizza(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" Pizza Details:\n");

        if (doughType != null) sb.append(" - Dough Type: ").append(doughType).append("\n");
        if (doughSize != null) sb.append(" - Dough Size: ").append(doughSize).append("\n");
        if (edgeStyle != null) sb.append(" - Edge Style: ").append(edgeStyle).append("\n");
        if (fermentationType != null) sb.append(" - Fermentation Type: ").append(fermentationType).append("\n");

        if (sauceType != null) sb.append(" - Sauce Type: ").append(sauceType).append("\n");
        if (sauceAmount != null) sb.append(" - Sauce Amount: ").append(sauceAmount).append("\n");
        if (sauceLayering != null) sb.append(" - Sauce Layering: ").append(sauceLayering).append("\n");

        if (cheeseType != null) sb.append(" - Cheese Type: ").append(cheeseType).append("\n");
        if (cheeseAmount != null) sb.append(" - Cheese Amount: ").append(cheeseAmount).append("\n");

        return sb.toString();
    }


}
