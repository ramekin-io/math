Math Your Food
===============

### Define

```
(def peanut-butter {:nutrient data ... for 2tbsp })
(def jelly         {:nutrient data ... for 2tbsp })
(def bread         {:nutrient data ... for 1 loaf })
```

### Portion

#### `scale`

```
(ramekin/scale peanut-butter "1" "tbsp")
# => {:nutrient data ... for 1 tbsp}

(ramekin/scale peanut-butter "2" "tbsp")
# => {:nutrient data ... for 2 tbsp}

(ramekin/scale peanut-butter "4" "tbsp")
# => {:nutrient data ... for 4 tbsp}
```

#### `divide` (`/`)

```
(ramekin// jar-of-peanut-butter 10)
# => {:nutrient data ... } 1/10th of a jar of peanut butter

(ramekin// p&j-sandwhich 2)
# => 1 half p&j sandwhich
```

### Recipes (addition)

#### `add` (`+`)

```
(def p&j-sandwhich
  (ramekin/+
    (ramekin/scale peanut-butter {:to "4 tbsp"   } )
    (ramekin/scale jelly         {:to "1 tbsp"   } )
    (ramekin/scale bread         {:to "2 slices" } )))
# => {:nutrient data for p&j sandwhich}
```


```
(def peanut-butter-and -banana
  (ramekin/+
    peanut-butter-serving
    banana))
```

### Difference

```
(ramekin/- apple orange)
# => {:diff between apple and orange }
```

### Leftovers

#### `subtract` (`-`)

```
(ramekin/- p&j-sandwhich (ramekin/* .5 p&j-sandwhich))
# => {:nutrient data for p&j sandwhich}
```

Ramekins
--------

```
# as ramekin (single-serving)
```

Data Structure
----------------

```clojure
{
  :calories              {:value 347,  :unit 'kcal }
  :mass                  {:value 243,  :unit 'g    }
  :macro-totals {
    :fat                 {:value 24,   :unit 'g    }
    :protein             {:value 30.6, :unit 'g    }
    :carbs               {:value 2,    :unit 'g    }
  }
  :fat {
    :unsaturated         {:value 0,    :unit 'g    }
    :mono-unsaturated    {:value 0,    :unit 'g    }
    :poly-unsaturated    {:value 0,    :unit 'g    }
    :saturated           {:value 8,    :unit 'g    }
    :uncategorized       {:value 16,   :unit 'g    }
  }
  :est-glycemic-load     {:value 2,    :unit 'unitless }
  :protein {
    :tryptophan          {:value 406,  :unit 'mg }
    :threonine           {:value 1351, :unit 'mg }
    :isoleucine          {:value 1633, :unit 'mg }
    :leucine             {:value 2644, :unit 'mg }
    :lysine              {:value 2221, :unit 'mg }
    :methionine          {:value 924,  :unit 'mg }
    :cystine             {:value 661,  :unit 'mg }
    :phenylalanine       {:value 1655, :unit 'mg }
    :tyrosine            {:value 1215, :unit 'mg }
    :valine              {:value 2088, :unit 'mg }
    :arginine            {:value 1995, :unit 'mg }
    :histidine           {:value 751,  :unit 'mg }
    :alanine             {:value 1788, :unit 'mg }
    :aspartic-acid       {:value 3231, :unit 'mg }
    :glutamic-acid       {:value 4072, :unit 'mg }
    :glycine             {:value 1050, :unit 'mg }
    :proline             {:value 1247, :unit 'mg }
    :serine              {:value 2364, :unit 'mg }
    :hydroxyproline      {:value 0,    :unit 'mg }
    :uncategorized       {:value 0,    :unit 'mg }
  }
  :carbohydrates {
    :dietary-fiber       {:value 0,    :unit 'g  }
    :sugar               {:value 2,    :unit 'g  }
  }
  :vitamins {
    :a {
      :beta-carotene     {:value 0,    :unit 'μg }
      :retinol           {:value 0,    :unit 'μg }
      :uncategorized     {:value 1183, :unit 'iu }
    }
    :c                   {:value 0,    :unit 'mg }
    :d                   {:value 85.1, :unit 'iu }
    :e {
      :d-alpha-tocopherol           {:value 2.4, :unit 'mg }
      :dl-alpha-tocopherol-acetate  {:value 0,   :unit 'mg }
      :uncategorized                {:value 0,   :unit 'iu }
    }
    :k                   {:value .7,   :unit 'μg }
    :thiamin             {:value .2,   :unit 'mg }
    :riboflavin          {:value 1.2,  :unit 'mg }
    :niacin              {:value .2,   :unit 'mg }
    :b6                  {:value .3,   :unit 'mg }
    :folate              {:value 114,  :unit 'μg }
    :b12                 {:value 3.1,  :unit 'μg }
    :biotin              {:value 0,    :unit 'mg }
    :pantothenic-acid    {:value 3.5,  :unit 'mg }
    :choline             {:value 610,  :unit 'mg }
    :betaine             {:value 1.5,  :unit 'mg }
  }
  :minerals {
    :sodium              {:value 340,  :unit 'mg }
    :potassium           {:value 326,  :unit 'mg }
    :calcium             {:value 129,  :unit 'mg }
    :iron                {:value 4.4,  :unit 'mg }
    :phosphorus          {:value 464,  :unit 'mg }
    :magnisium           {:value 29.2, :unit 'mg }
    :zinc                {:value 2.7,  :unit 'mg }
    :selenium            {:value 77,   :unit 'μg }
    :copper              {:value .2,   :unit 'mg }
    :manganese           {:value .1,   :unit 'mg }
    :chromium            {:value 0,    :unit 'mg }
    :molybdenum          {:value 0,    :unit 'mg }
    :chloride            {:value 0,    :unit 'mg }
    :fluoride            {:value 2.7,  :unit 'mg }
  }
  :sterols {
    :cholesterol         {:value 1028, :unit 'mg }
  }
  :other {
    :alcohol             {:value 0,    :unit 'g  }
    :water               {:value 184,  :unit 'g  }
    :ash                 {:value 2.1,  :unit 'g  }
    :caffeine            {:value 0,    :unit 'mg }
    :theobromine         {:value 0,    :unit 'mg }
  }
}

```


License
------------------

Copyright 2015 Will O'Brien

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
