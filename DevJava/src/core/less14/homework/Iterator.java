package core.less14.homework;

public interface Iterator {

	boolean hasNext();

	Object Next();

	public class Collection {

		private static Object[] values;

		public Collection(Object[] values) {
			this.values = values;
		}

		public claz1 createClazz1() {
			return new claz1();
		}

		public claz2 createClazz22() {
			return new claz2();
		}

		// Локальний клас-----------------------------------------------
		public Iterator createLokal() {
			class lokal implements Iterator {
				private int Position1 = 0;

				public lokal() {
				}

				@Override
				public boolean hasNext() {
					return Position1 <= values.length;
				}

				@Override
				public Object Next() {
					Position1 += 5;
					if ((Position1 % 2) != 0) {
						values[Position1] = Position1 - 100;
					} else if ((Position1 % 2) == 0) {
						values[Position1] = Position1;
					}
					Object result1 = values[Position1];
					return result1;
				}
			}
			return new lokal();
		}

		// Перший внутрішній клас----------------------------------------------------
		public class claz1 implements Iterator {
			private int Position = 0;

			public claz1() {
			}

			@Override
			public boolean hasNext() {
				for (int Position = 0; Position < values.length; Position++) {
					if ((Position % 2) != 0) {
						values[Position] = 0;
					}
				}
				return Position < values.length;
			}

			@Override
			public Object Next() {

				Object result = values[Position++];
				return result;
			}
		}

		// Другий внутрішній клас--------------------------------
		public class claz2 implements Iterator {
			private int Positionn = values.length - 1;

			public claz2() {
			}

			@Override
			public boolean hasNext() {
				return Positionn >= 0;
			}

			@Override
			public Object Next() {
				Object result = values[Positionn];
				Positionn -= 2;
				return result;
			}
		}

	}
}