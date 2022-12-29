#Tasks

    - Find the sum of all of the prices of all of the applications within the rating table.

            SELECT SUM(price)
            FROM rating;

    - Find the maximum value of total_ratings of all of the applications within the rating table.

            SELECT MAX(total_ratings)
            FROM rating

    - Find the average prices grouped by genre within the rating table.

            SELECT genre, AVG(price)
            FROM rating
            GROUP BY genre;
