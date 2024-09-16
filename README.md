# Survival Overhaul Mod

## Overview

The Survival Overhaul Mod enhances Minecraft with realistic survival mechanics, including:

- Temperature management
- Food and hydration needs
- Fatigue management
- Disease risks
- Injury consequences

## Features

### Temperature System
- Adjusts player status based on biome temperature.
- Effects include slowness and nausea from cold, and weakness and nausea from heat.

### Food System
- Applies negative effects when the player's food level is critically low.

### Hydration System
- Manages player hydration.
- Low hydration results in effects such as nausea and slowness.

### Fatigue System
- Tracks player fatigue levels.
- High fatigue results in slowness and mining fatigue.

### Disease System
- Can cause diseases under specific conditions, such as being in water during rain.

### Injury System
- Applies effects like slowness and mining fatigue from high falls.

## Code Structure

- **`SurvivalOverhaul.java`**: Main mod class that registers the systems.
- **`systems/TemperatureSystem.java`**: Manages temperature effects.
- **`systems/FoodSystem.java`**: Manages food effects.
- **`systems/HydrationSystem.java`**: Manages hydration effects.
- **`systems/FatigueSystem.java`**: Manages fatigue effects.
- **`systems/DiseaseSystem.java`**: Manages disease effects.
- **`systems/InjurySystem.java`**: Manages injury effects.
- **`util/PlayerData.java`**: Manages player data for hydration and fatigue.

#### License

Show the [LICENSE](LICENSE) file!
