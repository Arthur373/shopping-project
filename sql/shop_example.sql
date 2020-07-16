drop database shop_example;

create database shop_example;

use shop_example;
CREATE TABLE `products` (
  `id` bigint UNSIGNED primary key,
  `img` varchar(200)  NOT NULL,
  `title` varchar(200)  NOT NULL,
  `text` text NOT NULL,
  `price` int  NOT NULL,
  `old_price` int  DEFAULT NULL,
  `created_at` timestamp  DEFAULT current_timestamp,
  `updated_at` timestamp  DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `products` (`id`, `img`, `title`, `text`, `price`, `old_price`) VALUES
(1, 'p1.jpg', 'addidas', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 14199, 20000),
(2, 'p2.jpg', 'nike', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  16099, 22200),
(3, 'p3.jpg', 'Ceds', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 4099, 2000),
(4, 'p4.jpg', 'Boots N', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  12099, 17000),
(5, 'p5.jpg', 'Grey Ceds', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  10099, 15000),
(6, 'p6.jpg', 'Sport boots', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  9099, 11000),
(7, 'p7.jpg', 'Pink line Ceds', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  7099, 10000),
(8, 'p8.jpg', 'Pink line Ceds 2', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.',  15099, 21000),
(9, 'p9.jpg', 'clouts 1', ' Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 2499, 3000),
(10, 'p10.jpg', 'clouts 2', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 4599, 5200),
(11, 'p11.jpg', 'clouts 3', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 4099, 5000),
(12, 'p12.jpg', 'clouts 4', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 6599, 7000),
(13, 'p13.jpg', 'clouts 5', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 5099, 6000),
(14, 'p14.jpg', 'clouts 6', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 4299, 4300),
(15, 'p15.jpg', 'clouts 7', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 3599, 3800),
(16, 'p16.png', 'Boots', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 2499, 2600),
(17, 'p17.jpg', 'boots style', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 3699, 3800),
(18, 'p18.jpg', 'clouts 8', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 2899, 5400),
(19, 'p19.png', 'strawberry', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 399, 450),
(20, 'p20.png', 'grape', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 299, 300),
(21, 'p21.png', 'avocado', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 199, 200),
(22, 'p22.jpg', 'orange', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 299, 300),
(23, 'p23.jpg', 'tomato', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 199, 200),
(24, 'p24.jpg', 'broccoli', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 299, 300),
(25, 'p25.jpg', 'cherry', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 199, 200),
(26, 'p26.jpg', 'kiwi', 'Mill Oil is an innovative oil filled radiator with the most modern technology. If you are looking for something that can make your interior look awesome, and at the same time give you the pleasant warm feeling during the winter.', 1599, 2200);

CREATE TABLE `deals` (
  `id` bigint UNSIGNED primary key,
  `img` varchar(191)  NOT NULL,
  `title` varchar(191)  NOT NULL,
  `price` int NOT NULL,
  `old_price` int DEFAULT NULL,
  `created_at` timestamp  DEFAULT current_timestamp,
  `updated_at` timestamp  DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `deals` (`id`, `img`, `title`, `price`, `old_price`) VALUES
(1, 'r1.jpg', 'Black lace Heels', '189.00', '210.00'),
(2, 'r2.jpg', 'Black lace Heels', '189.00', '210.00'),
(3, 'r3.jpg', 'Black lace Heels', '189.00', '210.00'),
(4, 'r5.jpg', 'Black lace Heels', '189.00', '210.00'),
(5, 'r6.jpg', 'Black lace Heels', '189.00', '210.00'),
(6, 'r7.jpg', 'Black lace Heels', '189.00', '210.00'),
(7, 'r9.jpg', 'Black lace Heels', '189.00', '210.00'),
(8, 'r10.jpg', 'Black lace Heels', '189.00', '210.00'),
(9, 'r11.jpg', 'Black lace Heels', '189.00', '210.00');

CREATE TABLE `banner` (
  `id` int UNSIGNED primary key,
  `img` varchar(191) NOT NULL,
  `title` varchar(191) DEFAULT NULL,
  `desc` text DEFAULT NULL,
  `created_at` timestamp DEFAULT current_timestamp,
  `updated_at` timestamp DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `banner` (`id`, `img`, `title`, `desc`) VALUES
(1, 'banner-img.png', 'Nike New <br>Collection!', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.'),
(2, 'banner-img.png', 'Nike New <br>Collection!', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.');
