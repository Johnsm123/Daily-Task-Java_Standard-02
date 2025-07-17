cal -j 2016
cal -3 12 2015
date +%A
date +"DATE: %d/%m/%y"
date +"%P"
bc
ls -a
ls -m

du -s Contest
du -s .
# Create top-level directory
mkdir mydir

# Create subdirectories under mydir
mkdir -p mydir/colors/basic
mkdir -p mydir/colors/blended
mkdir -p mydir/shape
mkdir -p mydir/animals/mammals
mkdir -p mydir/animals/reptiles

# Create files under colors/basic
touch mydir/colors/basic/blue
touch mydir/colors/basic/green
touch mydir/colors/basic/red

# Create files under colors/blended
touch mydir/colors/blended/orange
touch mydir/colors/blended/pink
touch mydir/colors/blended/yellow

# Create files under mammals
touch mydir/animals/mammals/platypus
touch mydir/animals/mammals/bat
touch mydir/animals/mammals/dog

# Create files under reptiles
touch mydir/animals/reptiles/snakes
touch mydir/animals/reptiles/crocodile
touch mydir/animals/reptiles/lizard

# Create files under shapes
touch mydir/shape/circle
touch mydir/shape/cube
touch mydir/shape/square


# Create top-level directory
mkdir livingthings

# Create main subdirectories
mkdir -p livingthings/birds
mkdir -p livingthings/plants
mkdir -p livingthings/animals

# Create plant files
touch livingthings/plants/carrot
touch livingthings/plants/cabbage
touch livingthings/plants/daisy

# Create bird subdirectories and files
mkdir -p livingthings/birds/flyingbirds
mkdir -p livingthings/birds/nonflyingbirds

# Files under flyingbirds
touch livingthings/birds/flyingbirds/magie
touch livingthings/birds/flyingbirds/eider
touch livingthings/birds/flyingbirds/Stork

# Files under nonflyingbirds
touch livingthings/birds/nonflyingbirds/kiwi
touch livingthings/birds/nonflyingbirds/ostrich
touch livingthings/birds/nonflyingbirds/penguin

# Create animal subdirectories
mkdir -p livingthings/animals/mammals
mkdir -p livingthings/animals/reptiles

# Files under mammals
touch livingthings/animals/mammals/Jaguar
touch livingthings/animals/mammals/dog
touch livingthings/animals/mammals/tiger

# Files under reptiles
touch livingthings/animals/reptiles/alligator
touch livingthings/animals/reptiles/skink
touch livingthings/animals/reptiles/turtle
