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
(ramekin// jar-of-pb 10)
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
(def pb-banana
  (ramekin/+ pb-serving banana))
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


Data Structure
----------------

```clojure
{
  :calories
  :fat {
    :unsaturated
    :mono-unsaturated
    :poly-unsaturated
    :saturated
    :uncategorized
  }
  :est-glycemic-load
  :protein {
    :uncategorized
  }
  :carbohydrates {
    :fiber
    :sugar
  }
  :vitamins {

  }
  :minerals {

  }
  :sterols {}
  :other {
    :alcohol
    :ash
    :caffeine
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
